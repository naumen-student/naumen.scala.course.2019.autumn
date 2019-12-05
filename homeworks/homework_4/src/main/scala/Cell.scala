trait Cell { def toString: String }

class EmptyCell extends Cell { override def toString: String = "empty" }

class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

class ReferenceCell(val ix: Int, val iy: Int, table: Table) extends Cell {
  override def toString: String = {
    val referredCell = table.getCell(ix, iy);
    referredCell match {
      case None => "outOfRange"
      case some =>
        some.get match {
          case ref: ReferenceCell => {
            if (table.getCell(ref.ix, ref.iy).contains(this)) "cyclic"
            else ref.toString
          }
          case other => other.toString
        }
    }
  }
}

class StringCell(value: String) extends Cell {
  override def toString: String = value
}
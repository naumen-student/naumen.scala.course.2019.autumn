trait Cell {
 def toString: String;
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(val number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(val string: String) extends Cell {
  override def toString: String = string
}

class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell  {
  override def toString: String = table.getCell(ix, iy) match {
    case some => some.get match {
      case ref: ReferenceCell =>
        if (table.getCell(ref.ix, ref.iy).contains(this))
          "cyclic"
        else
          ref.toString
      case other => other.toString
    }
    case None => "outOfRange"
  }
}

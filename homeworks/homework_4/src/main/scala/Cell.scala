trait Cell {
  def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(string: String) extends Cell {
  override def toString: String = string
}

class ReferenceCell(val ix: Int, val iy: Int, table: Table) extends Cell {
  override def toString: String = {
      val cell = table.getCell(ix, iy)
        if (cell.isEmpty) "outOfRange"
        else
          cell.get match {
            case ref: ReferenceCell =>
              if (table.getCell(ref.ix, ref.iy).contains(this)) "cyclic"
              else ref.toString
            case other => other.toString
      }
  }
}
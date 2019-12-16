trait Cell {
  def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

case class NumberCell(value: Int) extends Cell {
  override def toString: String = value.toString
}

case class StringCell(value: String) extends Cell {
  override def toString: String = value
}

case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = table.getCell(ix, iy) match {
    case None => "outOfRange"
    case Some(cell) => cell match {
      case ref: ReferenceCell =>
        if (table.getCell(ref.ix, ref.iy).contains(this)) "cyclic" else ref.toString
      case other => other.toString
    }
  }
}
trait Cell {
  def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(value: Int) extends Cell {
  override def toString: String = value.toString
}

class StringCell(value: String) extends Cell {
  override def toString: String = value
}

class ReferenceCell(val x: Int, val y: Int, val table: Table) extends Cell {
  override def toString: String = table.getCell(x, y) match {
      case None => "outOfRange"
      case some => some.get match {
        case refCell: ReferenceCell =>
          if (table.getCell(refCell.x, refCell.y).contains(this))
            return "cyclic"
          else
            return refCell.toString
        case others => others.toString
      }
  }
}
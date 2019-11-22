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

class ReferenceCell(val ix: Int, val iy: Int, val table: Table) extends Cell {
  override def toString: String = {
    val cell = table.getCell(ix, iy)
    cell match {
      case None => "outOfRange"
      case Some(newCell) => newCell match {
        case refCell: ReferenceCell =>
          if (table.getCell(refCell.ix, refCell.iy).contains(this))
            return "cyclic"
          else
            return refCell.toString
        case others => others.toString
      }
    }
  }
}
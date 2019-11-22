trait Cell { def toString: String }

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(val num : Int) extends Cell {
  override def toString: String = num.toString
}

class StringCell(val str: String) extends Cell {
  override def toString: String = str
}

class ReferenceCell(val ix: Int, val iy: Int, table: Table) extends Cell {
  override def toString: String = {
    val cell = table.getCell(ix, iy);
    if (cell.isEmpty)
      return "outOfRange"
    cell.get match {
      case refCell: ReferenceCell =>
        if (table.getCell(refCell.ix, refCell.iy).contains(this))
          return "cyclic"
        refCell.toString
      case cell => cell.toString
    }
  }
}

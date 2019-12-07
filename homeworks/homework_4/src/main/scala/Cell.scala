case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String =  {
    val refCell = table.getCell(ix, iy)
    if (refCell.isDefined) {
      refCell.get match {
        case refCell: ReferenceCell => {
          if (refCell == previous) "cyclic"
          else refCell.getCellStringValue(this)
        }
        case _ => refCell.get.toString
      }
    }
    else "outOfRange"
  }
}
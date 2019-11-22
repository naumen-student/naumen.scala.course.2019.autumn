case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = getCellStringNumber()


  private def getCellStringNumber(previous: ReferenceCell = null): String = {
    val referenceCell = table.getCell(ix, iy)
    if (referenceCell.isEmpty)
      "outOfRange"
    else {
      referenceCell.get match {
        case refCell: ReferenceCell =>
          if (refCell == previous)  "cyclic" else  refCell.getCellStringNumber(this)
        case _ => referenceCell.get.toString
      }
    }
  }
}

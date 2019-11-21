case class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = getCellStringValue()

  private def getCellStringValue(previous: ReferenceCell = null): String = {
    val referenceCell = table.getCell(ix, iy)

    if (referenceCell.isDefined) {
      referenceCell.get match {
        case refCell: ReferenceCell => {
          if (refCell == previous) "cyclic"
          else refCell.getCellStringValue(this)
        }
        case _ => referenceCell.get.toString
      }
    }
    else "outOfRange"
  }
}

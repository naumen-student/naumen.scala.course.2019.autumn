class ReferenceCell(var x: Int, var y: Int, table: Table) extends Cell
{
    override def toString: String = getCellStringValue()

    private def getCellStringValue(previous: ReferenceCell = null): String = {
        val current_cell = table.getCell(x, y)
        if (current_cell.isDefined) {
            current_cell.get match {
                case ref: ReferenceCell => {
                    if (ref == previous) {
                        "cyclic"
                    } else {
                        ref.getCellStringValue(this)
                    }
                }
                case _ => current_cell.get.toString
            }
        } else {
            "outOfRange"
        }
    }
}
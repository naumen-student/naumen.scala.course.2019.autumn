import scala.annotation.tailrec

trait Cell {
    def toString: String
}

class EmptyCell extends Cell {
    override def toString: String = "empty"
}

case class NumberCell(number: Int) extends Cell {
    override def toString: String = number.toString
}

case class StringCell(value: String) extends Cell {
    override def toString: String = value
}

case class ReferenceCell(idx: Int, idy: Int, table: Table) extends Cell {

    override def toString: String = getCellStringValue()

    @tailrec
    private def getCellStringValue(previous: ReferenceCell = null): String = {
        val referenceCell = table.getCell(idx, idy)

        if (referenceCell.isDefined) {
            referenceCell.isDefined.get match {
                case refCell: ReferenceCell if refCell == previous => "cyclic"
                case refCell: ReferenceCell if refCell != previous => refCell.getCellStringValue(this)
                case _ => referenceCell.get.toString
            }
        }
        else "outOfRange"
    }

}


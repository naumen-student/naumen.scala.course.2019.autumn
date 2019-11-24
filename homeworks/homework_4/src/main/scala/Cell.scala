trait Cell{
    def toString: String
}

class NumberCell(number: Int) extends Cell{
    override def toString: String = number.toString
}

class StringCell(string: String) extends Cell{
    override def toString: String = string
}

class EmptyCell() extends Cell{
    override def toString: String = "empty"
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell{
    private var visited = false

    override def toString: String = {
        val cellOption = table.getCell(ix,iy)
        cellOption match {
            case Some(cell) =>
                cell match {
                    case referenceCell: ReferenceCell =>
                        if (referenceCell.visited) "cyclic"
                        else {
                            referenceCell.visited = true
                            referenceCell.toString
                        }

                    case _ => cell.toString
                }
            case None => "out of range"
        }
    }
}

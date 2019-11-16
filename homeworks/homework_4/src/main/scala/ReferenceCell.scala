class ReferenceCell(var ix: Int, var iy: Int, table: Table) extends Cell {
    override def toString: String = {
        val referenceCell = table.getCell(ix, iy)
        referenceCell match {
            case some => some.get match {
                case ref: ReferenceCell =>
                    if (table.getCell(ref.ix, ref.iy).contains(this)) "cyclic"
                    else ref.toString
                case _ => referenceCell.get.toString
            }
            case None => "outOfRange"
        }
    }
}

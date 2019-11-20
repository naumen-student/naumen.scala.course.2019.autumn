class ReferenceCell(var x: Int, var y: Int, table: Table) extends Cell
{
  override def toString: String = table.getCell(x, y) match {
    case some => some.get match {
      case ref: ReferenceCell =>
        if (table.getCell(ref.x, ref.y).contains(this))
          "cyclic"
        else
          ref.toString
      case other => other.toString
    }
    case None => "outOfRange"
  }
}

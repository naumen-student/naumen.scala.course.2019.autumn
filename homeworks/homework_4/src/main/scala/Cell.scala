trait Cell {
  def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(var value: Int) extends Cell {
  override def toString: String = value.toString
}

class StringCell(var value: String) extends Cell {
  override def toString: String = value
}

class ReferenceCell(var ix: Int, var iy: Int, table: Table) extends Cell {
  override def toString: String = table.getCell(ix, iy) match {
    case None => "outOfRange"
    case some => some.get match {
        case ref: ReferenceCell => {
          if (table.getCell(ref.ix, ref.iy) == Some(this))
            "cyclic"
          else
            ref.toString
        }
        case other => other.toString
      }
  }
}
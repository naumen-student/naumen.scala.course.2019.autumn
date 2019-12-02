trait Cell {
   def toString: String
}

class EmptyCell extends Cell {
  override def toString = "empty"
}

class NumberCell(intValue: Int) extends Cell {
  override def toString = intValue.toString
}

class StringCell(stringValue: String) extends Cell {
  override def toString = stringValue
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString: String = {
    var cell = table.getCell(ix, iy)
    cell match {
      case someCell => someCell.get match {
        case refCell: ReferenceCell => {
          if (table.getCell(refCell.ix, refCell.iy).contains(this))
            return "cycling"
          else return refCell.toString
        }
        case otherCell => otherCell.toString
      }
      case None => "outOfRange"
    }
  }
}
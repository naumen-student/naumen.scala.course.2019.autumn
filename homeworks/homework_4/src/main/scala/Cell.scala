trait Cell{
  def toString: String
}

class EmptyCell extends Cell {
  override def toString: String = "empty"
}

class NumberCell(number: Int) extends Cell {
  override def toString: String = number.toString
}

class StringCell(str: String) extends Cell {
  override def toString: String = str
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {

  override def toString: String = getStringByReference()

  private def getStringByReference(previous: Option[ReferenceCell] = None): String = {
    val referenceCell = table.getCell(ix, iy)

    if (referenceCell.isDefined) {
      referenceCell.get match {
        case refCell: ReferenceCell => {
          if (previous.contains(refCell)) {
            "cyclic"
          } else {
            refCell.getStringByReference(Some(this))
          }
        }
        case _ => referenceCell.get.toString
      }
    } else "outOfRange"
  }
}
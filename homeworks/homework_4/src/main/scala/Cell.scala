trait Cell {
  def toString: String
}

//Пустая ячейка (класс EmptyCell)
class EmptyCell extends Cell {
  override def toString: String = "empty"
}

//Ячейка с 32-битным целым числом (класс NumberCell)
class NumberCell(val number: Long) extends Cell {
  override def toString: String = number.toString
}

//Ячейка с текстом (класс StringCell)
class StringCell(val str: String) extends Cell {
  override def toString: String = str
}

//Ячейка, содержащая ссылку на другую ячейку (класс ReferenceCell)
class ReferenceCell(val x: Int, val y: Int, val table: Table) extends Cell {
  override def toString: String = {
    val cell = table.getCell(x, y)
    cell match {
      case None => "outOfRange"
      case Some(c) => c match {
        case ref: ReferenceCell => {
          if (table.getCell(ref.x, ref.y) == Some(this))
            "cyclic"
          else
            ref.toString
        }
        case other => other.toString
      }

    }
  }
}
import scala.collection.mutable.ListBuffer

trait Cell{
  def toString: String;
}

class EmptyCell() extends Cell{
  override def toString: String = "empty";
}

class NumberCell(value: Int) extends Cell{
  override def toString: String = value.toString();
}

class StringCell(value: String) extends Cell{
  override def toString: String = value;
}

class ReferenceCell(val ix: Int, val iy: Int, table: Table) extends Cell{

  protected var tail:ListBuffer[Cell] = new ListBuffer[Cell];

  def getParent(refCell: ReferenceCell, tail:ListBuffer[Cell]): Option[Cell] ={
    val cell:Cell = table.getCell(refCell.ix,refCell.iy).getOrElse(throw new Exception);
    if (!cell.isInstanceOf[ReferenceCell]) Some(cell);
    else if(tail.contains(cell)) None else getParent(cell.asInstanceOf[ReferenceCell], tail.+=:(cell))
  }

  override def toString: String = {
    val parCell = getParent(this, tail);
    if(parCell == None) "cyclic"
    else parCell.getOrElse(throw new Exception).toString();
  }


}
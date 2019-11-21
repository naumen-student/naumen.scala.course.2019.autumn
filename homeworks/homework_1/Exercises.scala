import scala.collection.mutable.ListBuffer

object Exercises {

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



  class Table(width:Int , length:Int){

    var cells:ListBuffer[Cell] = InitializeEmptyCells(width, length);

    private def InitializeEmptyCells(width:Int , length:Int): ListBuffer[Cell] ={
      var res:ListBuffer[Cell] = ListBuffer[Cell]();
      for(i <- 0 until width * length) res .+=:(new EmptyCell());
      res;
    }

    def getCell(ix: Int, iy: Int): Option[Cell] = {
      if ( ix >= width || ix < 0 || iy < 0 || iy >= length  ) None;
      else Some(cells(getIndex(ix , iy, width)));
    }

    def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
      if( ix >= width || ix < 0 || iy < 0 || iy >= length) throw new Exception("kek");
      cells(getIndex(ix , iy, width)) = cell ;
    }


    def getIndex (ix: Int, iy: Int, width: Int) = width * ix + iy;
  }
}
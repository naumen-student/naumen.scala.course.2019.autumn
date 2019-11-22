import scala.collection.mutable.ListBuffer

class Table(width:Int , length:Int){

  var cells:ListBuffer[Cell] = fillEmptyCells(width, length);

  private def fillEmptyCells(width:Int , length:Int): ListBuffer[Cell] ={
    var res:ListBuffer[Cell] = ListBuffer[Cell]();
    for(i <- 0 until width * length) res .+=:(new EmptyCell());
    res;
  }

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if ( ix >= width || ix < 0 || iy < 0 || iy >= length  ) None;
    else Some(cells(getIndex(ix , iy, width)));
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if( ix >= width || ix < 0 || iy < 0 || iy >= length)
      throw new Exception("Cell is out of bounds of the table");
    cells(getIndex(ix , iy, width)) = cell ;
  }


  def getIndex (ix: Int, iy: Int, width: Int) = width * ix + iy;
}

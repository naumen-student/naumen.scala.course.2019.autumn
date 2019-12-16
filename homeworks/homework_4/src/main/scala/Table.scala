import scala.collection.mutable.ListBuffer

class Table(x:Int, y:Int) {
  private val cells: ListBuffer[Cell] = ListBuffer.fill(x * y)(new EmptyCell)

  private def coords(ix: Int, iy: Int): Int = ix + iy * y

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix >= x || ix < 0 || iy >= y || iy < 0) None
    else Some(cells(coords(ix, iy)))
  }
  def setCell(ix: Int, iy: Int, cell: Cell) : Unit = {
    if (ix >=0 && ix < x && iy >=0 && iy < y)  cells(coords(ix, iy)) = cell
  }
}
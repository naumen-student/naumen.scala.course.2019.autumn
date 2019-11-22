import scala.collection.mutable.{Seq => mutableSeq}

class Table(width: Int, height: Int) {
  private val cells: mutableSeq[Cell] = mutableSeq.fill(width * height)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < 0 || ix >= width || iy < 0 || iy >= height) None else Some(cells(ix + iy * width))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (!(ix < 0 || ix >= width || iy < 0 || iy >= height)) cells(ix + iy * width) = cell
  }
}
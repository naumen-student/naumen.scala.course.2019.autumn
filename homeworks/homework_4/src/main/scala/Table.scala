import scala.collection.mutable.{Seq => mutableSeq}

class Table(width: Int, height: Int) {
  private val cells: mutableSeq[Cell] = mutableSeq.fill(width * height)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (isOutOfRange(ix, iy)) None
    else Some(cells(ix + iy * width))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (!isOutOfRange(ix, iy)) cells(ix + iy * width) = cell
  }

  private def isOutOfRange(ix: Int, iy: Int) = ix < 0 || ix >= width || iy < 0 || iy >= height
}
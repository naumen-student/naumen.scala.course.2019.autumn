import scala.collection.mutable.{Seq => mutableSeq}

class Table(width: Int, height: Int) {
  private val cells: mutableSeq[Cell] = mutableSeq.fill(width * height)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (isOutOfRange(ix, iy)) None
    else Some(cells(toLinearIndex(ix, iy)))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (!isOutOfRange(ix, iy)) cells(toLinearIndex(ix, iy)) = cell
  }

  private def isOutOfRange(ix: Int, iy: Int) = ix < 0 || ix >= width || iy < 0 || iy >= height
  private def toLinearIndex(ix: Int, iy: Int) = ix + iy * width
}
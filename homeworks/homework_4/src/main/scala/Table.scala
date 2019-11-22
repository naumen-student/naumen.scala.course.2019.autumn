import scala.collection.mutable.{Seq => mutableSeq}

class Table(width: Int, length: Int){
  private val cells: mutableSeq[Cell] = mutableSeq.fill(width * length)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] =
    if(ix > width || ix < 0 || iy > length || iy < 0) {
      None
    } else {
      Some(cells(getIndex(ix, iy)))
    }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (getCell(ix, iy).nonEmpty) {
      cells(getIndex(ix, iy)) = cell
    }
  }

  private def getIndex(ix: Int, iy: Int) = ix + iy * width
}
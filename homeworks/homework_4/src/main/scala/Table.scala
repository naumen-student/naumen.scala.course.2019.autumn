class Table(val width: Int, val height: Int) {
  private val seqTable: scala.collection.mutable.Seq[Cell] = scala.collection.mutable.Seq.fill(width * height)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < 0 || ix >= width || iy < 0 || iy >= height)
      None
    else
      Some(seqTable(ix + iy * width))
  }

  def setCell(x: Int, y: Int, cell: Cell) = {
    if (x >= 0 && x < width && y >= 0 && y < height)
      seqTable(y * width + x) = cell
  }
}
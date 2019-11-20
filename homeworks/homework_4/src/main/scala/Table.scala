class Table(val width: Int, val height: Int) {
  private val cells: scala.collection.mutable.Seq[Cell] = scala.collection.mutable.Seq.fill(width * height)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < 0 || ix >= width || iy < 0 || iy >= height)
      None
    else
      Some(cells(ix + iy * width))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (ix >= 0 && ix < width && iy >= 0 && iy < height)
      cells(ix + iy * width) = cell
  }
}
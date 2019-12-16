class Table (width: Int, height: Int) {
  private val cells: Array[Cell] = Array.fill[Cell] (width * height) { new EmptyCell }

  def getCell(ix: Int, iy: Int): Option[Cell] =
    if(!IsOutOfRange(ix, iy))
      Some(cells(ix + iy * width))
    else None

  def setCell(ix: Int, iy: Int, cell: Cell): Unit =
    if(!IsOutOfRange(ix, iy))
      cells(ix + iy * width) = cell

  private def IsOutOfRange(x: Int, y: Int): Boolean =
    x < 0 || y < 0 || x >= width || y >= height
}
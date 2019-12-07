class Table(val length: Int, val width: Int) {
  private val cells: scala.collection.mutable.Seq[Cell] = scala.collection.mutable.Seq.fill(length * width)(new EmptyCell)

  //возвращает ячейку по индексам строки и столбца, либо “None”, если ix или iy вне границ таблицы
  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if (ix < 0 || ix >= length || iy < 0 || iy >= width) None
    else Some(cells(ix + iy * length))
  }

  //устанавливает ячейку cell в указанные столбец и строку
  //здесь ix - индекс колонки (ix>=0), iy - индекс строки (iy>=0)
  //cell - ячейка таблицы, представленная конкретной реализацией
  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if (ix >= 0 && ix < length && iy >= 0 && iy < width)
      cells(ix + iy * length) = cell
  }

}
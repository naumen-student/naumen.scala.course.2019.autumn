
class Table(rows: Int, cols: Int){
    private val _cells = new Array[Option[Cell]](rows * cols)
    _cells.indices.foreach(i => _cells.update(i, Some(new EmptyCell)))

    def getCell(ix: Int, iy: Int): Option[Cell] ={
        if ((ix >= cols || ix < 0) || (iy >= rows || iy < 0))
            return None

        _cells(getIndex(ix,iy))
    }

    def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
        if ((ix >= cols || ix < 0) || (iy >= rows || iy < 0))
            throw new Exception("Address out of range of table")

        _cells(getIndex(ix,iy)) = Option(cell)
    }

    private def getIndex(ix: Int, iy: Int) : Int = ix + iy * cols
}

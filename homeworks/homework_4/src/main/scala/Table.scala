class Table(val width: Int, val height: Int) {

    private val table: scala.collection.mutable.Seq[Cell] = scala.collection.mutable.Seq.fill(width * height)(new EmptyCell)

    def isOnTable(ix: Int, iy: Int): Boolean = (ix >= 0 && ix < width  && iy >= 0 && iy < height)

    def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
        if (isOnTable(ix, iy)) {
            table(ix + width * iy) = cell
        }
    }

    def getCell(ix: Int, iy: Int): Option[Cell] = {
        if(isOnTable(ix, iy)) {
            Some(table(ix + width * iy))
        }
        else {
            None
        }
    }
}
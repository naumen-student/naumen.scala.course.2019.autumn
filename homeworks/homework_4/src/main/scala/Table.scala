import scala.collection.mutable.{Seq => mutableSeq}

class Table(width: Int, height: Int) {

    private val cells: mutableSeq[Cell] = mutableSeq.fill(width * height)(new EmptyCell)

    def getCell(idx: Int, idy: Int): Option[Cell] = {
        if (isOutOfRange(idx, idy)) None
        else Some(cells(toLinearIndex(idx, idy)))
    }

    def setCell(idx: Int, idy: Int, cell: Cell): Unit = if (!isOutOfRange(idx, idy)) cells(toLinearIndex(idx, idy)) = cell

    private def isOutOfRange(idx: Int, idy: Int) = idx < 0 || idx >= width || idy < 0 || idy >= height
    private def toLinearIndex(idx: Int, idy: Int) = idx + idy * width
}
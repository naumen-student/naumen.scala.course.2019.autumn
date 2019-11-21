import scala.collection.mutable

class Table(length: Int, height: Int) {

  var cells: mutable.Seq[Cell] = mutable.Seq.fill(length*height)(new EmptyCell)

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if((ix > 0 && ix < length) && (iy > 0 && iy < height))
      return Some(cells(ix+iy*length))
    else return None
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if ((ix > 0 && ix <= length) && (iy > 0 && iy <= height))
     return cells(ix + iy * length) = cell
  }
}
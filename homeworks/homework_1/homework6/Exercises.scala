import scala.collection.mutable.ListBuffer

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    var res: List[T] = List[T]();
    for(i <- seq.length - 1 to 0 by -1)  res :+= seq(i);
    res.toSeq;
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */



  def fibonacci4Index(idx: Int): Int = {
    var pieceOfFibonacci = CurrentPiece(1,0,1,0);
    for(i <- 0 until idx)
      pieceOfFibonacci = pieceOfFibonacci.findNextPiece();
    pieceOfFibonacci.previousNumber;
  }

  def fibonacci(idx: Int): Seq[Int] = {

    var res: List[Int] = List(0);
    for(i <- 0 until idx) {
      if(i == 0) res :+= 1 else
        res :+= res(i) + res(i - 1);
    }

    res.toSeq;
  }

  case class CurrentPiece(var currentIndex: Int,
                          var previousIndex: Int,
                          var currentNumber: Int,
                          var previousNumber: Int){

    def findNextPiece() : CurrentPiece = {
      CurrentPiece(currentIndex + 1, previousIndex + 1,
        currentNumber + previousNumber, currentNumber);
    }

  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..")

  val Punctuation: Seq[Char] = Seq('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-',
    '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^',
    '_', '`', '{', '|', '}', '~');

  def morse(text: String): String = {
    var res: String = "";
    for ( i <- 0 until text.length){
      if(MORSE.contains(text(i).toUpper.toString)) res += MORSE(text(i).toUpper.toString) + " "
      else {
        if(Punctuation.contains(text(i)) ) res = res.dropRight(1);
        res += text(i) + " "
      }
    }
    res.dropRight(1);

  }


  def wordNotTextReverse(word: String): String = {
    var i:Int = 0;
    var firstPart:String = "";
    while (!Punctuation.contains(word(i))){
      firstPart +=  word(i);
      i += 1;
    }

    if(word(0).isUpper) {
      firstPart = firstPart(0).toLower + firstPart.drop(1);
      firstPart = firstPart.dropRight(1) + firstPart(firstPart.length-1).toUpper;

    }

    firstPart.reverse + word.drop(firstPart.length)


  }


  def wordReverse(text: String): String = {
    var res:String = "";
    val temp = text.split(" ");
    for(i <- 0 until temp.length)
      res += wordNotTextReverse(temp(i)) + " ";

    res.dropRight(1);
  }

}
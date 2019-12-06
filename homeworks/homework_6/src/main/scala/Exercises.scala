import scala.collection.immutable.List

object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = {
    var xs: Seq[T] = Seq()
    for (x <- seq)
      xs = x +: xs;
    return xs;
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    var currentIdx: Int = 0;
    var fibList: List[Int] = List()
    fibList =  1 :: 0 :: fibList;
    while (currentIdx <= idx) {
      val nextValue: Int = fibList.head + fibList(1);
      fibList = nextValue :: fibList;
      currentIdx += 1
    };
    fibList = fibList.reverse
    return fibList(idx)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    idx match {
      case 0 => return Seq(0)
      case 1 => return Seq(0, 1)
      case _ => {
        var currentIdx: Int = 2;
        var fibSeq: Seq[Int] = Seq(1, 0)
        while (currentIdx <= idx) {
          val nextValue: Int = fibSeq.head + fibSeq(1);
          fibSeq = nextValue +: fibSeq;
          currentIdx += 1
        }
        fibSeq = fibSeq.reverse
        return fibSeq
      }
    }

  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    var newText: String = new String()
    for (letter <- text) {
      if (MORSE.contains(letter.toString.toUpperCase))
        newText += MORSE(letter.toString.toUpperCase) + " "
      else
        newText += letter.toString + " "
    }
    return newText.reverse.tail.reverse
  }


  def wordReverse(text: String): String = {
    val wordArray: Array[String] = text.split("[.,!?: ]+")
    var newText: String = text
    var revWord: String = new String()
    for(word <- wordArray) {
      revWord = word
      if (word.head.isUpper) {
        revWord = revWord.reverse
        revWord = revWord.substring(0, 1).toUpperCase +
          revWord.substring(1, word.length - 1) +
          revWord.substring(word.length - 1, word.length).toLowerCase
      }
      else
        revWord = revWord.reverse
      newText = newText.replace(word, revWord)
    }
    return newText
  }
}

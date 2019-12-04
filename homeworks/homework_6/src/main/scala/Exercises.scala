import scala.annotation.tailrec

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] =
    (for (i <- seq.length until 0 by -1) yield seq(i - 1))

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = idx match {
    case _ if idx <= 1 => idx
    case _ => fibonacci4Index(idx-1) + fibonacci4Index(idx-2)
  }

  def fibonacci(idx: Int): Seq[Int] = for (i <- 0 until idx+1) yield fibonacci4Index(i)

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")
  def checker(text: String) = if (text.length > 1) " " else ""
  def morse(text: String): String = {
    @tailrec
    def morsehelper(word: String, morses: String = ""): String = {
      if (word.isEmpty) morses
      else
        morsehelper(
          word.tail,
          morses + MORSE.getOrElse(
            word.toUpperCase.head.toString,
            word.head.toString
          ) + checker(word)
        )
    }
    morsehelper(text)
  }


  def wordReverse(text: String): String = {
    var result = text
    for(word <- text.split("[.,!?: ]+")) {
      result = result.replaceFirst(word, reverseHelper(word))
    }
    result
  }

  private def reverseHelper(word: String): String = {
    var result = new StringBuilder(word)
    if (word.head.isUpper) {
      result.setCharAt(0, word.head.toLower)
      result.setCharAt(word.length - 1, word.last.toUpper)
    }
    result.reverse.result()
  }
}

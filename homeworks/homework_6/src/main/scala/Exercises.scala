import scala.util.matching.Regex

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    if (idx == 0) 0
    else if (idx < 3) 1
    else fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
  }

  def fibonacci(idx: Int): Seq[Int] = for (i <- 0 to idx) yield fibonacci4Index(i)

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    var result: String = ""
    for (letter <- text) {
      if (MORSE.contains(letter.toUpper.toString)) result += " " + MORSE(letter.toUpper.toString)
      else result += " " + letter.toString
    }
    result.tail
  }


  def wordReverse(text: String): String = {
    val words = text.split("[^а-яА-я]+")
    var result = text
    for(word <- words) {
      result = result.replaceFirst(word, reverseWord(word))
    }
    result
  }

  private def reverseWord(word: String): String = {
    var result = new StringBuilder(word)
    if (word.head.isUpper) {
      result.setCharAt(0, word.head.toLower)
      result.setCharAt(word.length - 1, word.last.toUpper)
    }
    result.reverse.result()
  }

}

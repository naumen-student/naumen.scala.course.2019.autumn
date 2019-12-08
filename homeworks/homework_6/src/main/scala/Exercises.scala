
object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {

    var result: Seq[T] = Seq()
    for (item <- seq) result +:= item
    result
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    if (idx < 2 ) idx
    else fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
  }

  def fibonacci(idx: Int): Seq[Int] = for (i <- 0 to idx) yield fibonacci4Index(i)

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = text
    .toUpperCase
    .map(x => if (MORSE contains x.toString) MORSE(x.toString) else x.toString)
    .mkString(" ")

  def wordReverse(text: String): String = {
    var result = text
    val wordsTex = text
      .split(" ")
      .map(_.filter(_.isLetterOrDigit).toString)

    wordsTex.foreach(word => {
      var wordReplace = word
      if (wordReplace.head.isUpper)
        wordReplace = wordReplace.toLowerCase.init + wordReplace.last.toUpper

      result = result.replace(word, wordReplace.reverse)
    })
    result;
  }

}

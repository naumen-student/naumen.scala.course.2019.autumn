object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse

  /**
   * https://ru.wikipedia.org/wiki/?????_?????????
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = idx match {
    case _ if idx <= 1 => idx
    case _ => fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
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
    var res = text
    val words = text
      .split(" ")
      .map(_.filter(_.isLetterOrDigit).toString)

    words.foreach(word => {
      var wordToReplace = word
      if (wordToReplace.head.isUpper)
        wordToReplace = wordToReplace.toLowerCase.init + wordToReplace.last.toUpper

      res = res.replace(word, wordToReplace.reverse)
    })
    res;
  }

}

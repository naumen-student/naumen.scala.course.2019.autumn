object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    var res: Seq[T] = Seq()
    for (item <- seq)
      res +:= item
    res
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    idx match {
      case _ if idx <= 1 => idx
      case _ => fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
    }
  }

  def fibonacci(idx: Int): Seq[Int] = {
    for (i <- 0 until (idx + 1))
      yield fibonacci4Index(i)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    text.toUpperCase.toCharArray.map(char => EncodeInMorse(char.toString)).mkString(" ")
  }

  private def EncodeInMorse(char: String) : String = {
    if (MORSE.contains(char)) MORSE(char)
    else char
  }

  def wordReverse(text: String): String = {
    var resultText = text
    val words = text.split(" ").map(_.filter(_.isLetterOrDigit).toString)
    words.foreach(word => {
      var replacement = word
      if (replacement.head.isUpper) {
        replacement = replacement.toLowerCase.init + replacement.last.toUpper
      }
      resultText = resultText.replace(word, replacement.reverse)
    })
    resultText
  }

}

object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = for (i <- seq.length to 1 by -1) yield seq(i - 1)
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

  def morse(text: String): String = {
    var result: String = ""
    for (character <- text) {
      if (MORSE.contains(character.toUpper.toString))
        result += " " + MORSE(character.toUpper.toString)
      else
        result += " " + character
    }
    result.tail
  }

  def wordReverse(text: String): String = {
    val words = text.split("[^а-яА-я]+")
    var result = text
    for(word <- words) {
      var newWord = ""
      if (word(0).isUpper)
        newWord += word(word.length - 1).toUpper
      else
        newWord += word(word.length - 1)
      for (i <- word.length - 2 to 0 by -1)
        newWord += word(i).toLower
      result = result.replaceFirst(word, newWord)
    }
    result
  }

}

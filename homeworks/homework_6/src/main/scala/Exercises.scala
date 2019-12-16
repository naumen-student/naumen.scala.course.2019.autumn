object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = {
    var result: Seq[T] = Seq()

    for (i <- seq)
      result +:= i

    result
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    if (idx <= 1)
      idx
    else fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    for (i <- 0 to idx)
      yield fibonacci4Index(i)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    text.toUpperCase.toCharArray.map(
      char => if (MORSE.contains(char.toString))
        MORSE(char.toString)
      else
        char.toString).mkString(" ");
  }

  def wordReverse(text: String): String = {
    val words: Array[String] = text.split("[^а-яА-яa-zA-z]+")
    var result: String = text
    var buffer: String = new String()

    for (word <- words) {
      buffer = word

      if (word.head.isUpper) {
        buffer = buffer.reverse
        buffer = buffer.substring(0, 1).toUpperCase +
          buffer.substring(1, word.length - 1) +
          buffer.substring(word.length - 1, word.length).toLowerCase
      }
      else
        buffer = buffer.reverse

      result = result.replace(word, buffer)
    }
    result
  }

}

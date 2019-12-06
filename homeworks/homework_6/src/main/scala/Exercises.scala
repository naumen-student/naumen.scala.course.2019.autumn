object Exercises {
  
  def reverse[T](seq: Seq[T]): Seq[T] = {
    var res: Seq[T] = Seq()
    for (el <- seq)
      res = el +: res
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
      case _ if idx <= 1 => return idx
      case _ => fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
    }
  }

  def fibonacci(idx: Int): Seq[Int] = for (i <- 0 until idx + 1) yield fibonacci4Index(i)

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
        char.toString).mkString(" ")
  }

  def wordReverse(text: String): String = {
    var res = text
    var reversedWord = new String()
    for(word <- text.split("[.,!?;: ]+")) {
      reversedWord = word
      if (word.head.isUpper) {
        reversedWord = reversedWord.reverse
        reversedWord = reversedWord.substring(0, 1).toUpperCase +
          reversedWord.substring(1, word.length - 1) +
          reversedWord.substring(word.length - 1, word.length).toLowerCase
      }
      else
        reversedWord = reversedWord.reverse
      res = res.replace(word, reversedWord)
    }
    res
  }
}

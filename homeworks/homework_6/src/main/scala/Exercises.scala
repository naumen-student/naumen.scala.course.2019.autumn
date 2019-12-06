object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    var xt: Seq[T] = Seq()
    for (x <- seq)
      xt = x +: xt
    xt
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
    text.toUpperCase.toCharArray.map(char => getMorseCode(char.toString)).mkString(" ");
  }

  private def getMorseCode(char: String) : String = {
    if (MORSE.contains(char)) {
      MORSE(char);
    } else {
      char;
    }
  }


  def wordReverse(text: String): String = {
    val wordArray: Array[String] = text.split("[.,!?: ]+")
    var newText: String = text
    var rWord: String = new String()
    for(word <- wordArray) {
      rWord = word
      if (word.head.isUpper) {
        rWord = rWord.reverse
        rWord = rWord.substring(0, 1).toUpperCase +
          rWord.substring(1, word.length - 1) +
          rWord.substring(word.length - 1, word.length).toLowerCase
      }
      else
        rWord = rWord.reverse
      newText = newText.replace(word, rWord)
    }
    newText
  }
}
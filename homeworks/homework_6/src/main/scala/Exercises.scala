object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = idx match{
    case 0 => idx
    case 1 => idx
    case _ if idx >=2 => fibonacci4Index(idx-1) + fibonacci4Index(idx-2)
    case _ if idx < 0 => fibonacci4Index(idx+2) - fibonacci4Index(idx+1)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    if(idx < 0)
      for (i <- idx until 1) yield fibonacci4Index(i)
    else
      for (i <- 0 until idx+1) yield fibonacci4Index(i)
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  lazy val punctSymbols = Seq('!', ',', '?', ':', ';')

  def morse(text: String): String = {
    var result = symbolToMorse(text.head)
    for (symbol <- text.tail){
      if (!punctSymbols.contains(symbol))
        result += " " + symbolToMorse(symbol)
      else result += symbolToMorse(symbol)
    }
    result
  }

  def symbolToMorse(symbol: Char): String = {
    if (MORSE.contains(symbol.toUpper.toString))
      MORSE(symbol.toUpper.toString)
    else symbol.toString
  }


  def wordReverse(text: String): String = {
    val words = text.split("[^а-яА-Я]+")
    var result = text
    for(word <- words) {
      val newWord = new StringBuilder(word)
      if (word.head.isUpper){
        newWord.setCharAt(0, word.head.toLower)
        newWord.setCharAt(word.length - 1, word.last.toUpper)
      }
      result = result.replaceFirst(word, newWord.reverse.result())
    }
    result
  }

}

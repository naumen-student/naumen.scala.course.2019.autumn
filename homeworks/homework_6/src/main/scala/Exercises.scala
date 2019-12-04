object Exercises {
    def reverse[T](seq: Seq[T]): Seq[T] = {
      if (seq == Nil) return seq
      Seq(seq.last) ++ reverse(seq.init)
    }

    def fibonacci4Index(idx: Int): Int = fibonacci(idx).last

    def fibonacci(idx: Int): Seq[Int] = {
      val initialElements = Seq(0,1)
      fibonacciNext(initialElements, idx)
    }

    private def fibonacciNext(currentElements: Seq[Int], maxIndex: Int) : Seq[Int] = {
        if (currentElements.length - 1 > maxIndex) return currentElements.init
        fibonacciNext(currentElements ++ Seq(currentElements.takeRight(2).sum), maxIndex)
    }

    lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

    def morse(text: String): String = {
        val res = text.toUpperCase
          .toCharArray
          .map(char => getMorseCode(char.toString))
          .mkString(" ")

        res
    }

    private def getMorseCode(char: String) : String = {
        char match {
            case code if MORSE.contains(code) => MORSE(code)
            case _ => char
        }
    }

    def wordReverse(text: String): String = {
      var resultText = text
      val words = text
          .split(" ")
          .map(_.filter(_.isLetterOrDigit).toString)

      words.foreach(word => {
          var replacement = word
          if (replacement.head.isUpper)
              replacement = replacement.toLowerCase.init + replacement.last.toUpper

          resultText = resultText.replace(word, replacement.reverse)
      })
        resultText
    }
}

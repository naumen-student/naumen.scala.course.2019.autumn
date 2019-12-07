object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = {
    def reverseInner[T](seq: Seq[T], accumulator: Seq[T]): Seq[T] =
      seq match {
        case Seq() => accumulator
        case Seq(head, tail@_*) => reverseInner(tail, head +: accumulator)
      }

    reverseInner(seq, Seq())
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = {
    def fibonacciInner(toGo: Int, prevPrev: Int, prev: Int): Int = {
      val newValue = prevPrev + prev
      if (toGo == 0) newValue else fibonacciInner(toGo - 1, prev, newValue)
    }

    idx match {
      case 0 => 0
      case 1 => 1
      case n => fibonacciInner(n - 2, 0, 1)
    }
  }


  def fibonacci(idx: Int): Seq[Int] = {
    def fibonacciInner(toGo: Int, accumulator: Seq[Int], prevPrev: Int, prev: Int): Seq[Int] = {
      val newValue = prevPrev + prev
      if (toGo == 0)
        accumulator :+ newValue
      else
        fibonacciInner(toGo - 1, accumulator :+ newValue, prev, newValue)
    }

    idx match {
      case 0 => Seq(0)
      case 1 => Seq(0, 1)
      case n => fibonacciInner(n - 2, Seq(0, 1), 0, 1)
    }
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    def morseInner(c: Char): String = {
      val s = c.toString
      MORSE getOrElse(s.toUpperCase(), s)
    }

    def glue2(accumulator: String, s: String): String = if (accumulator.isEmpty) s else accumulator + " " + s

    def glueAll(seq: Seq[String]): String = seq.foldLeft("")(glue2)

    glueAll(text map morseInner)
  }


  def wordReverse(text: String): String = {
    def wordsInner(wordProcessor: Seq[Char] => String,
                   textLeft: String,
                   textDone: Seq[String],
                   currentWord: Seq[Char]): Seq[String] = {
      if (textLeft.isEmpty)
        if (currentWord.isEmpty) textDone else textDone :+ currentWord.toString()
      else {
        val c: Char = textLeft.charAt(0)
        val tail = textLeft.substring(1)
        if (c.isLetter)
          wordsInner(wordProcessor, tail, textDone, currentWord :+ c)
        else if (currentWord.isEmpty)
          wordsInner(wordProcessor, tail, textDone :+ c.toString, currentWord)
        else
          wordsInner(wordProcessor, tail, textDone :+ wordProcessor(currentWord) :+ c.toString, Seq())
      }
    }

    def words(wordProcessor: Seq[Char] => String, text: String): Seq[String] = {
      wordsInner(wordProcessor, text, Seq(), Seq())
    }

    def capitalize(letters: Seq[String]): String =
      letters match {
        case Seq() => ""
        case Seq(head, tail@_*) => (head.toUpperCase +: (tail map (x => x.toLowerCase))).mkString
      }

    def capitalizeRevert(letters: Seq[Char]): String =
      letters match {
        case Seq() => ""
        case Seq(head, tail@_*) =>
          val inverse: Seq[Char] = reverse(letters)
          if (head.isUpper)
            capitalize(inverse map ( c => c.toString))
          else inverse.mkString
      }

    words(capitalizeRevert, text).mkString
  }

}

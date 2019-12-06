import scala.annotation.tailrec

object Exercises {

    def reverse[T](seq: Seq[T]): Seq[T] =
        (for (i <- seq.length until 0 by -1) yield seq(i - 1))

    def fibonacci4Index(idx: Int): Int = idx match {
        case _ if idx <= 1 => idx
        case _ => fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
    }

    def fibonacci(idx: Int): Seq[Int] = for (i <- 0 until idx + 1) yield fibonacci4Index(i)

    lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
        "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
        "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
        "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
        "Y" -> "-.--", "Z" -> "--..")

    def checker(text: String): String = if (text.length > 1) " " else ""

    def morse(text: String): String = {
        @tailrec
        def morseHelper(word: String, morses: String = ""): String = {
            if (word.isEmpty) morses
            else
                morseHelper(
                    word.tail,
                    morses + MORSE.getOrElse(
                        word.toUpperCase.head.toString,
                        word.head.toString
                    ) + checker(word)
                )
        }

        morseHelper(text)
    }


    def wordReverse(string: String): String = {
        def revCap(s: String): String =
            s.headOption match {
                case Some(c) if c.isUpper =>
                    (c.toLower +: s.drop(1)).reverse.capitalize
                case Some(c) if c.isLower =>
                    s.reverse
                case _ => s
            }

        string
            .split("\\b")
            .map(revCap)
            .mkString("")
    }
}

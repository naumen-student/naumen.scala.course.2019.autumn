import scala.collection.mutable

object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = seq match {
    case Nil => seq
    case _ => seq.last :: reverse(seq.init).toList
  }

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx
   * @return
   */
  def fibonacci4Index(idx: Int): Int = fibonacci(idx).last

  def fibonacci(idx: Int): Seq[Int] = idx match {
    case _ if idx < 2 => Seq(0, 1).take(idx + 1)
    case _ => {
      val range = mutable.MutableList.range(1, idx)
      for (i <- range.drop(2)) range(i - 1) = range(i - 3) + range(i - 2)
      0 :: 1 :: range.toList
    }
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
                       "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
                       "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
                       "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
                       "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = {
    text
      .toUpperCase
      .map(ch => morseEncode(ch.toString))
      .mkString(" ")
  }

  private def morseEncode(ch: String): String = {
    if (MORSE.contains(ch.toString))
      MORSE(ch.toString)
    else ch.toString
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
    string.split("\\b").map(revCap).mkString("")
  }

}

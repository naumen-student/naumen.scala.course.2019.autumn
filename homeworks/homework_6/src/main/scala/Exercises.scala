import scala.collection.mutable

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq match {
    case Nil => seq
    case _ => seq.last :: reverse(seq.init).toList
  }

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

  def morse(text: String): String = text
    .toUpperCase
    .map(x => if (MORSE contains x.toString) MORSE(x.toString) else x.toString)
    .mkString(" ")


  def wordReverse(text: String): String =  {
    var result = text
    val words = text
      .split(" ")
      .map(_.filter(_.isLetterOrDigit).toString)

    words.foreach(word => {
      var wordToReplace = word
      if (wordToReplace.head.isUpper)
        wordToReplace = wordToReplace.toLowerCase.init + wordToReplace.last.toUpper

      result = result.replace(word, wordToReplace.reverse)
    })
    result;
  }


}

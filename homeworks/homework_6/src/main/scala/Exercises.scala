object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = (seq.length until 0 by -1).map(i => seq(i - 1))
  //def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse

  def fibonacci4Index(idx: Int): Int = idx match {
    case _ if idx <= 1 => idx
    case _ => fibonacci4Index(idx - 1) + fibonacci4Index(idx - 2)
  }

  def fibonacci(idx: Int): Seq[Int] = (0 until idx + 1).map(i => fibonacci4Index(i))

  lazy val MORSE: Map[String, String] = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = text.toUpperCase
    .map(x => if (MORSE contains x.toString) MORSE(x.toString) else x.toString).mkString(" ")


  def wordReverse(text: String): String = {
    var res = text
    val words = text.split(" ").map(_.filter(_.isLetterOrDigit).toString)

    words.foreach(word => {
      var wordToReplace: String = word
      if (wordToReplace.head.isUpper)
        wordToReplace = wordToReplace.toLowerCase.init + wordToReplace.last.toUpper
      res = res.replace(word, wordToReplace.reverse)
    })
    res
  }
}

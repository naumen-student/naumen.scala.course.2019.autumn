object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = {
    var result = seq

    if (seq != Nil) {
      result = Seq(seq.last) ++ reverse(seq.init)
    }
    result
  }

  def fibonacci4Index(idx: Int): Int = fibonacci(idx).last

  def fibonacci(idx: Int): Seq[Int] = {
    fibonacciNext(Seq(0, 1), idx);
  }

  private def fibonacciNext(currentElements: Seq[Int], maxIndex: Int) : Seq[Int] = {
    if (currentElements.length - 1 > maxIndex) {
      currentElements.init;
    } else {
      fibonacciNext(currentElements ++ Seq(currentElements.takeRight(2).sum), maxIndex);
    }
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..");

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
    var resultText = text;
    val words = text.split(" ").map(_.filter(_.isLetterOrDigit).toString);
    words.foreach(word => {
      var replacement = word;
      if (replacement.head.isUpper) {
        replacement = replacement.toLowerCase.init + replacement.last.toUpper;
      }
      resultText = resultText.replace(word, replacement.reverse);
    })
    resultText;
  }

}
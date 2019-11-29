object Exercises {

    def reverse[T](seq: Seq[T]): Seq[T] = {
        var reversedSeq: Seq[T] = Seq()
        for (curr <- seq)
            reversedSeq = curr +: reversedSeq
        reversedSeq
    }

    def fibs(a: Int = 0, b: Int = 1): Stream[Int] = Stream.cons(a, fibs(b, a + b))

    /**
     * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
     *
     * @param idx
     * @return
     */
    def fibonacci4Index(idx: Int): Int =
        fibs().apply(idx)

    def fibonacci(idx: Int): Seq[Int] = {
        fibs() take idx + 1 toList
    }

    private def transferToMorse(char: Char) : String = {
        if (MORSE.contains(char.toString)) MORSE(char.toString) else char.toString
    }

    val SPACE_DELIMITER = " "

    lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
        "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
        "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
        "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
        "Y" -> "-.--", "Z" -> "--..")

    def morse(text: String): String = {
        text.toUpperCase.toCharArray.map(char => transferToMorse(char)).mkString(SPACE_DELIMITER);
    }

    def wordReverse(text: String): Any = {
        var output = text

        val words = text
            .split(SPACE_DELIMITER)
            .map(_.filter(_.isLetterOrDigit).toString)

        words.foreach( word => {
            var reversedWord = word.reverse
            if(word.head.isUpper) {
                reversedWord = (word.toLowerCase.init + word.last.toUpper).reverse
            }
            output = output.replace(word, reversedWord)
        })
        output
    }
}

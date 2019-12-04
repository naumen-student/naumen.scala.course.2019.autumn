import java.io

import scala.collection.immutable

object Exercises {

  def reverse[T](seq: Seq[T]): Seq[T] = seq.foldLeft(List[T]())((x, y) => y :: x).toSeq

  /**
    * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
    *
    * @param idx
    * @return
    */
  def fibonacci4Index(idx: Int): Int = fibonacci(idx).last

  def fibonacci(idx: Int): Seq[Int] = if (idx < 0) Seq.empty[Int] else {
    if (idx == 0) Seq(0)
    else {
      val res: Array[Int] = new Array[Int](idx + 1)
      res(0) = 0
      res(1) = 1

      for (i <- 2 to idx)
        res(i) = res(i - 2) + res(i - 1)

      res.toSeq
    }
  }

  lazy val MORSE: Map[String, String] = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String = text
    .toUpperCase
    .map(x => if (MORSE contains x.toString) MORSE(x.toString) else x.toString)
    .mkString(" ")


  def wordReverse(text: String): String = {
    val regex = " ,.!@#$%^&*()-_=+;:'|/?<>`~[]{}"
    var tmp = text
    var res = ""

    while (res.length < text.length) {
      var word = tmp.takeWhile(p => !regex.contains(p))
      if (word.nonEmpty) {
        val cases = word.map(f => f.isUpper)
        word = word.reverse

        for (i <- 0 until word.length)
          if (cases(i)) res += word(i).toUpper.toString
          else res += word(i).toLower.toString

        tmp = tmp.drop(word.length)
      }

      val symbols = tmp.takeWhile(p => regex.contains(p))
      if (symbols.nonEmpty) {
        res += symbols
        tmp = tmp.drop(symbols.length)
      }
    }

    return res
  }

}

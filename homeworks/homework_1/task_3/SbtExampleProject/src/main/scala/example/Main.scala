package example

object Main extends App {
  def greeting(greet_word: String = "Hello", name: String = "Oleg Glukhikh") =
    println(s"$greet_word Scala! This is $name")

  val rev_name = "Oleg Glukhikh".reverse
  val greet_words = ("Guten Morgen", "Hola")

  greeting()
  greeting(name = rev_name)

  greeting(greet_word = greet_words._1)
  greeting(greet_word = greet_words._1, name = rev_name)

  greeting(greet_word = greet_words._2)
  greeting(greet_word = greet_words._2, name = rev_name)
}

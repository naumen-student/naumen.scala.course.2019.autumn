object Main extends App {
  def GreetWithName(greetWord: String, name: String): Unit = {
    Console.println(s"${greetWord} Scala! This is ${name}")
  }

  def GreetWithNameReverse(greetWord: String, name: String): Unit = {
    GreetWithName(greetWord, name.reverse)
  }

  val name = "Maxim Fominykh"
  val greetWords = List("Hello", "Hola", "Guten tag")

  for (greetWord <- greetWords) {
    GreetWithName(greetWord, name)
    GreetWithNameReverse(greetWord, name)
  }
}

package hello

object Main extends App {
  val name = "Aleksandra Mezentseva"
  val str = " Scala! This is "
  val greetings = Map("en"->"Hello", "es"->"Hola", "de"->"Guten tag")

  def hello(greeting: String, name: String): Unit = {
    println(greeting + str + name) }

  hello(greetings("en"), name)

  hello(greetings("es"), name)

  hello(greetings("de"), name)

  hello(greetings("en"), name.reverse)

  hello(greetings("es"), name.reverse)

  hello(greetings("de"), name.reverse)
}

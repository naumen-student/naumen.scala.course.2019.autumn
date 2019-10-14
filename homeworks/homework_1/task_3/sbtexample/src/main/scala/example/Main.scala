package example

object Main extends App {
  def greet(greeting: String = "Hello", name: String = "me") = println(greeting + " Scala! This is " + name)

  val greetings = Array("Hello", "Salaam Alaikum", "Bonjour")
  val name = "Julia Osintseva"
  val names = Array(name, name.reverse)

  for (name <- names; greeting <- greetings) greet(greeting, name)
}

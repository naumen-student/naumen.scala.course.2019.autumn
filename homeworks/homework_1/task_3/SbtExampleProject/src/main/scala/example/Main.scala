package example

object Main extends App {
  val greetings = Array("Hello", "Guten tag", "Привет")
  def greetingsPrint(name: String): Unit = {
    greetings.foreach(greeting => println(s"$greeting Scala! This is $name"))
  }

  def reverse(line: String): String = {
    val stringBuilder = new StringBuilder()
    for (i <- line.length - 1 to 0 by -1) stringBuilder.append(line(i))
    stringBuilder.toString()
  }


  val myName = "Nur Kasimov"
  greetingsPrint(myName)
  greetingsPrint(reverse(myName))
}

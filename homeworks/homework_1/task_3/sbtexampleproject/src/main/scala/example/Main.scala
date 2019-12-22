package example

object Main extends App {
  var greetings = List("Hello", "Guten morgen meine liebe")
  var myName = "Eugene Podoinikov"
  var samePart = " Scala! This is "

  def hello(strings: String*)  : Unit =
  {
    strings.foreach(print)
    println()
  }

  hello(greetings(0), samePart, myName)
  hello(greetings(1), samePart, myName)

  var revName = myName.reverse

  hello(greetings(0), samePart, revName)
  hello(greetings(1), samePart, revName)
}

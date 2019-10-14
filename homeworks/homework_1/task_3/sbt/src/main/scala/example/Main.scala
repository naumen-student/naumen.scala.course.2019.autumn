package example

object Main extends App {
  var a = "Roman Kochetov"
  val b = "Hello Scala! This is "
  val c = "Guten Tag Scala! Das ist "
  val d = "Greetings Scala! This is "
  var e = a.reverse

  def hello(first: String) :Unit = {
    println (first + a)
    println (first + e)
  }

  hello(b)
  hello(c)
  hello(d)
}

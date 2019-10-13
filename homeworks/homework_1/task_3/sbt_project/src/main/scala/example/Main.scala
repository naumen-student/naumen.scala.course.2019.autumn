package example

object Main extends App {
  println("Hello Scala! This is Denis Podkhvatilin")

  var s = "Hola Scala! This is Denis Podkhvatilin"
  var a = "Guten tag Scala! This is "
  var b = "Denis Podkhvatilin"

  def hello(s: String) : Unit = println(s)
  hello(s)

  def hello(s1: String, s2: String) : Unit = println(s1 + s2.reverse)
  hello(a, b);
}
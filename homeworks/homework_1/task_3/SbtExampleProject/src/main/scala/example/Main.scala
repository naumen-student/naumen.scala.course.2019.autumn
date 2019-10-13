package example

object Main extends App {
  def greeting(local: String): Unit = {
    println(local + " Scala! This is Vyacheslav V")
  }

  def reverseGreeting(local: String): Unit = {
    println(local + " Scala! This is " + ("Vyacheslav").reverse + " V")
  }

  greeting("Hello")
  greeting("Salam")
  greeting("Sup")
  reverseGreeting("Hello")
  reverseGreeting("Salam")
  reverseGreeting("Sup")
}

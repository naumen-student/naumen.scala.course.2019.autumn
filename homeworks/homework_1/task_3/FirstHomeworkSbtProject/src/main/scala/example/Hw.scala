package example

object Main extends App {

  val HelloWords = List("Hello", "Hola", "Guten tag", "Здравствуйте")
  val Name = "Russkikh Aleksey"
  val ReversedName = Name.reverse

  def greetings(HelloWord: String = HelloWords(0), Name: String = Name): Unit = println(s"$HelloWord Scala! This is $Name")

  greetings()
  greetings(HelloWord = HelloWords(1))
  greetings(HelloWord = HelloWords(2))
  greetings(Name = ReversedName)
  greetings(HelloWords(1), ReversedName)
  greetings(HelloWords(2), ReversedName)
}
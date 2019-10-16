package example

object Main extends App {
  val name = "Boris Liskov"
  val scalaPhrase = " Scala! This is "
  val phrases: List[String] = List("Hello", "Hola", "Guten tag", "Sälem")

  def printPhrase(phrase: String, name : String) : Unit = {
    println (phrase + scalaPhrase + name)
  }

  def printPhrases(needToReverse: Boolean) : Unit = {
    val printableName = if(needToReverse) name.reverse else name
    for (p <- phrases) {
      printPhrase(p, printableName)
    }
  }

  printPhrases(false)
  printPhrases(true)
}

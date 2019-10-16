object Homework_1 {

  def Hello(Name: String, Privet: String): Unit = {
    println(Privet + " Scala! This is " + Name)
  }

  def main(args: Array[String]): Unit = {

    val Name = "Vladislav Sivirukhin"
    val WordsHello = Array("Salam", "Aloha", "Hola", "你好", "Guten tag", "Здраво")

    val ReverseName = Name.reverse

    for (i <- WordsHello) {
      Hello(Name, i)
    }

    println("\n")

    for (i <- WordsHello) {
      Hello(ReverseName, i)
    }
  }
}

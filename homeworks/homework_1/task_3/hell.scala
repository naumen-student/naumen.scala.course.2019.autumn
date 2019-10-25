package example

object hell {
  def main(args: Array[String]): Unit = {
    val name = "Nikita Tokarev"
    val rename = name.reverse
    print_set(name)
    print_set(rename)
  }

  def print_set(name : String): Unit =
  {
    val mid = " Scala! This is "
    val fast1 = "Hello"
    val fast2 = "Ohha"
    val fast3 = "Wagwan"

    println(fast1 + mid + name)
    println(fast2 + mid + name)
    println(fast3 + mid + name)
  }
}

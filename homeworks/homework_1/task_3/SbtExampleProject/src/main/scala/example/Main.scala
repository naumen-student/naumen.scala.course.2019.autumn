object Main extends App {
  val name : String = "Mukov Beslan";

  def hello(hello: String, name: String): Unit = {
    println(hello + " Scala! This is " + name)
  };

  hello("Hello", name);

  hello("Hola", name);

  hello("Bonjour", name);

  hello("Konnichi wa", name);

  hello("Привет", name);

  hello("Hello", name.reverse);

  hello("Hola", name.reverse);

  hello("Bonjour", name.reverse);

  hello("Konnichi wa", name.reverse);

  hello("Привет", name.reverse);
}
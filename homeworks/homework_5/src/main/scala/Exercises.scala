object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal



  case class Shelter[+A <: Animal] (val inhabitants: List[A])  {

    def +[B >: A <: Animal] (newInhabitant:B) : Shelter[B] =
      new Shelter[B](newInhabitant :: inhabitants)

    def ++[B >: A <: Animal] (another: Shelter[B]) : Shelter[B] =
      new Shelter[B](inhabitants ++ another.inhabitants)

    def getNames : List[String] = inhabitants map (x => x.name)

    def feed[B >: A <: Animal](food: Food[B]) : List[String] = inhabitants map (eater => food feed eater)
  }



  trait Food[A <: Animal]{

    /*Определить для еды метод feed, который принимает животное того типа, которым параметризована эта еда,
    и возвращает строку, содержащую “<имя животного=""> eats <название еды="" со="" строчной="" буквы="">". */
    def feed (eater: A) : String = eater.name +  " eats " + name.toLowerCase

    def name : String = getClass.getSimpleName.replace('$', ' ').trim
  }

  case object Meat extends Food[Animal]

  case object Milk extends Food[Cat]

  case object Bread extends Food[Dog]

}

import scala.collection.mutable.ListBuffer

object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  trait Food[-A <: Animal]{
    def eat(animal: A): String;
  }

  case object Meat extends Food[Animal]{
    override def eat(animal: Animal): String =
      animal.name.toString() + " eats meat";
  }

  case object Milk extends Food[Cat]{
    override def eat(animal: Cat): String =
      animal.name.toString() + " eats milk";
  }

  case object Bread extends Food[Dog]{
    override def eat(animal: Dog): String =
      animal.name.toString() + " eats bread";
  }







  case class Shelter[+A <: Animal](val guests: List[A]){

    def ++ [Between >: A <: Animal] (anotherShelter: Shelter[Between]): Shelter[Between]
    = Shelter(guests ::: anotherShelter.guests);

    def + [Between >: A <: Animal]  (animal: Between): Shelter[Between]
    = Shelter(guests ::: List(animal));

    def getNames: List[String] = guests.map(_.name);

    def feed[UnderFood <: Food[A]](food: UnderFood):List[String] = {
      guests.map(food.eat)
    }
  };



}
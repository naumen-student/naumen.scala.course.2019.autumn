object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+T <: Animal](animals: List[T] ){
      def + [TAnimal >: T <: Animal](animal: TAnimal): Shelter[TAnimal] = Shelter(animal :: animals)
      def ++ [TShelter >: T <: Animal](shelter: Shelter[TShelter]): Shelter[TShelter] = Shelter(animals ++ shelter.animals)

      def getNames : List[String] = animals.map(_.name)

      def feed[TFood <: Food[T]](food: TFood) = {animals.map(food.feed)}
  }


  trait Food[-T <: Animal] {
      def feed(animal: T) : String
  }

  case object Meat extends Food[Animal] {
      override def feed(animal: Animal) = s"${animal.name} eats meat"
  }

  case object Milk extends Food[Cat] {
      override def feed(animal: Cat) = s"${animal.name} eats milk"
  }

  case object Bread extends Food[Dog] {
      override def feed(animal: Dog) = s"${animal.name} eats bread"
  }
}

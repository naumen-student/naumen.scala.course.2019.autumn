object Exercises {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[A >: T <: Animal](newAnimal: A): Shelter[A] = Shelter[A](newAnimal :: animals)
    def ++[A >: T <: Animal](newAnimals: Shelter[A]): Shelter[A] = Shelter[A](newAnimals.animals ++ animals)
    def getNames: List[String] = animals.map(animal => animal.name)
    def feed(food : Food[T]) : List[String] = animals.map(animal => food.feed(animal))
  }

  trait Food[-T <: Animal]{
    def feed(animal: T) : String
  }

  case object Meat extends Food[Animal] {
    override def feed(animal: Animal): String = animal.name + " eats meat"
  }

  case object Milk extends Food[Cat] {
    override def feed(animal: Cat): String = animal.name + " eats milk"
  }

  case object Bread extends Food[Dog] {
    override def feed(animal: Dog): String = animal.name + " eats bread"
  }
}

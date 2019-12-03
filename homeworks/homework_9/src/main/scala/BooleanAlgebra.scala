sealed trait BooleanAlgebra

object BooleanAlgebra {

    //TODO: Реализовать типы True, False


    /**
      * Возвращает true (для тестов)
      * @return
      */
    def True: BooleanAlgebra = ???

    /**
      * Возвращает false (для тестов)
      * @return
      */
    def False: BooleanAlgebra = ???

    def and: PartialFunction[(BooleanAlgebra, BooleanAlgebra), BooleanAlgebra] = ???

    def or: PartialFunction[(BooleanAlgebra, BooleanAlgebra), BooleanAlgebra] = ???

    def not: PartialFunction[BooleanAlgebra, BooleanAlgebra] = ???
}

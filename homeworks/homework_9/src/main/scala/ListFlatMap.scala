trait ListFlatMap {

    /**
      * Применяет функцию f ко всем элементам списка и возвращает новый список
      *
      * map(x => x + 1)(List(0, 1, 2, 3, 4)) = List(1, 2, 3, 4, 5)
      */
    protected def map[A, B](f: A => B): Seq[A] => Seq[B]

    /**
      * Объекдиняет все списки в один без нарушения порядка
      *
      * flatten(List(List(0, 1, 2), List(3, 4), List(), List(5))) = List(0, 1, 2, 3, 4, 5)
      */
    protected def flatten[A]: Seq[Seq[A]] => Seq[A]

    /**
      * Используя функций map и flatten реализовать функцию flatMap
      *
      * flatMap(x => List(x, x + 1))(List(0, 2, 4, 6, 8))
      *   = flatten(map(x => List(x, x + 1))(List(0, 2, 4, 6, 8)))
      *   = flatten(List(List(0, 1), List(2, 3), List(4, 5), List(6, 7), List(8, 9)))
      *   = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
      */
    def flatMap[A, B](f: A => List[B]): Seq[A] => Seq[B] = ???

}

import scala.annotation.tailrec

trait ListFilter {

    private def iterativeFilter[A](condition: A => Boolean): Seq[A] => Seq[A] = { list =>
        val buffer = scala.collection.mutable.ListBuffer.empty[A]

        for(item <- list) {
            if(condition(item)) {
                buffer += item
            }
        }

        buffer.toList

    }

    /**
      * Реализовать функцию фильтрации используя хвостовую рекурсию.
      * note: любой цикл можно переписать в хвостовую рекурсию,
      *   если переместить изменяемую переменную в параметры функции
      */
    @tailrec
    private def filterLoop[A](condition: A => Boolean, inputList: Seq[A], buffer: Seq[A]): Seq[A] = ???

    def tailrecFilter[A](condition: A => Boolean): Seq[A] => Seq[A] = { input =>
        //TODO
        val initBufferValue: Seq[A] = ???

        filterLoop(
            condition = condition,
            inputList = input,
            buffer = ???
        )
    }

}

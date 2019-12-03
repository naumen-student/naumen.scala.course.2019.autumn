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

      */
    @tailrec
    private def filterLoop[A](condition: A => Boolean, inputList: Seq[A], buffer: Seq[A]): Seq[A] = ???

    def tailrecFilter[A](condition: A => Boolean): Seq[A] => Seq[A] = { input =>

        val initBufferValue: Seq[A] = ??? // TODO

        filterLoop(
            condition = condition,
            inputList = input,
            buffer = ??? // TODO
        )
    }

}

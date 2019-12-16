package homework_3
import scala.collection.generic.GenericCompanion

object Exercises {


    /**
     * Задание №1
     * Реализуйте функцию, которая принимает любой тип и преобразует его в строку.
     * Для всех типов кроме Boolean достаточно воспользоваться стандартной функцией .toString.
     * Для типа Boolean сделайте особое преобразование: true -> "правда", false -> "ложь".
     *
     * Реализуйте функцию тремя разными способами, отличающимися тем, как определяется какой тип имеет значение переданное в аргументе. 
     * Определение типа необходимо для реализации специальной логики работы с Boolean значениями, которая описана в условии выше.
     */
    def prettyBooleanFormatter1(x: Any): String = x match {
        case logic: Boolean => prettyBooleanFormatterInner(logic)
        case any: Any => any.toString
    }

    def prettyBooleanFormatter2(x: Any): String = {
        try {
             if (x.asInstanceOf[Boolean]) "Правда" else "Ложь"
        } catch {
            case _: Exception => x.toString
        }
    }

    def prettyBooleanFormatter3(x: Any): String = {
        if (x.getClass.getSimpleName == "Boolean")
            prettyBooleanFormatterInner(x.asInstanceOf[Boolean])
        else
            x.toString;
    }

    private def prettyBooleanFormatterInner(x: Boolean) = {
        if (x) "Правда" else "Ложь"
    }

    /**
     * Задание №2
     * Реализуйте функцию нахождения максимального числа в переданной коллекции интов (можно использовать все методы стандартной библиотеки).
     *
     * Реализуйте функцию тремя разными способами, отличающимися тем как функция себя ведет на пустой коллекции. 
     * Обратите внимание на возвращаемые типы.
     */
    def max1(xs: Seq[Int]): Int = xs.max

    def max2(xs: Seq[Int]): Seq[Int] = {
        if (xs.isEmpty) Seq()
        else xs.sortWith(_ > _).take(1)
    }

    def max3(xs: Seq[Int]): Option[Int] = if (xs.nonEmpty) Some(xs.max) else None

    /**
     * Задание №3
     * Допустим дана функция sumIntegers, которая умеет суммировать числа.
     */
    def sumIntegers[CollectionType <: Iterable[Int]](xs: CollectionType): Int = xs.sum

    /**
     * Реализуйте на основе нее 3 варианта суммирования 2х чисел, отличающиеся способом передачи этих 2х чисел в функцию sumIntegers.
     * Как минимум одна из реализаций должна использовать тип данных (класс) написанный вами самостоятельно.
     */ 
    def sum1(x: Int, y: Int): Int = sumIntegers(Seq(x, y))
    def sum2(x: Int, y: Int): Int = sumIntegers(new MyCollection(x, y))
    def sum3(x: Int, y: Int): Int = sumIntegers(new Point(x, y))

    class MyCollection(val items: Int*) extends Iterable[Int] {
        override def iterator: Iterator[Int] = items.iterator
    }

    class Point(val x: Int, val y: Int) extends Iterable[Int] {
        override def iterator: Iterator[Int] = new PointIterator

        class PointIterator extends Iterator[Int] {
            var currentPoint = 0

            override def hasNext: Boolean = currentPoint < 2
            override def next(): Int = {
                currentPoint += 1
                if (currentPoint == 1) x else y
            }
        }
    }
}

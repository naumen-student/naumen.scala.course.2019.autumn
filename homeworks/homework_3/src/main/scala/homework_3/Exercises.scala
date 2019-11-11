package homework_3

import scala.collection.mutable

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
    def prettyBooleanFormatter1(x: Any): String = {
        if (!x.isInstanceOf[Boolean]) return x.toString

        val boolValue = x.asInstanceOf[Boolean]
        if (boolValue) "правда" else "ложь"
    }

    def prettyBooleanFormatter2(x: Any): String = {
        x match {
            case true => "правда"
            case false => "ложь"
            case _ => x.toString
        }
    }

    def prettyBooleanFormatter3(x: Any): String = {
        if (x.getClass.getName == "java.lang.Boolean")
            return x match {
                case true => "правда"
                case false => "ложь"
            }

        x.toString
    }


    /**
     * Задание №2
     * Реализуйте функцию нахождения максимального числа в переданной коллекции интов (можно использовать все методы стандартной библиотеки).
     *
     * Реализуйте функцию тремя разными способами, отличающимися тем как функция себя ведет на пустой коллекции. 
     * Обратите внимание на возвращаемые типы.
     */
    def max1(xs: Seq[Int]): Int = {
        if (xs.isEmpty) return 0
        xs.max
    }


    def max2(xs: Seq[Int]): Seq[Int] = {
        if (xs.isEmpty) return Seq()
        Seq(xs.max)
    }

    def max3(xs: Seq[Int]): Option[Int] = {
        if (xs.isEmpty) return None
        Some(xs.max)
    }

    /**
     * Задание №3
     * Допустим дана функция sumIntegers, которая умеет суммировать числа.
     */
    def sumIntegers[CollectionType <: Iterable[Int]](xs: CollectionType): Int = xs.sum

    def sum1(x: Int, y: Int): Int = sumIntegers(Seq(x,y))
    def sum2(x: Int, y: Int): Int = sumIntegers(Set(x,y))
    def sum3(x: Int, y: Int): Int = sumIntegers(MySeq(x,y))

    case class MySeq(x: Int, y: Int) extends Iterable[Int] {
        private val values = Seq(x,y)

        override def iterator: Iterator[Int] = {
            values.iterator
        }
    }

}

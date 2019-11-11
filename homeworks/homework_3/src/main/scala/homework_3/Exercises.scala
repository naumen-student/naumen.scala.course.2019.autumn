package homework_3

import scala.collection.immutable.Queue

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
        if (x.isInstanceOf[Boolean]) boolToString(x.asInstanceOf[Boolean]) else x.toString
    }

    def prettyBooleanFormatter2(x: Any): String = {
        x match {
            case b: Boolean => boolToString(b)
            case _ => x.toString
        }
    }

    def prettyBooleanFormatter3(x: Any): String = {
        if (x.getClass.getSimpleName == "Boolean") boolToString(x.asInstanceOf[Boolean]) else x.toString
    }

    def boolToString (x:Boolean): String = {
        if (x == true) "правда" else "ложь"
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
        if (xs.isEmpty) List() else List(xs.max)
    }

    def max3(xs: Seq[Int]): Option[Int] = {
        if (xs.isEmpty) None else Some(xs.max)
    }

    /**
     * Задание №3
     * Допустим дана функция sumIntegers, которая умеет суммировать числа.
     */
    def sumIntegers[CollectionType <: Iterable[Int]](xs: CollectionType): Int = xs.sum

    /**
     * Реализуйте на основе нее 3 варианта суммирования 2х чисел, отличающиеся способом передачи этих 2х чисел в функцию sumIntegers.
     * Как минимум одна из реализаций должна использовать тип данных (класс) написанный вами самостоятельно.
     */
    class Numbers(val list: List[Int]) extends Iterable[Int]
    {
        override def iterator: Iterator[Int] = list.iterator
    }
    def sum1(x: Int, y: Int): Int = sumIntegers(List(x,y))
    def sum2(x: Int, y: Int): Int = sumIntegers(Queue(x,y))
    def sum3(x: Int, y: Int): Int = sumIntegers(new Numbers(List(x,y)))

}

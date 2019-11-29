package homework_3

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
           if (x.isInstanceOf[Boolean]) {
               if (x.asInstanceOf[Boolean]) {
                   return "правда"
               }
               else {
                   return "ложь"
               }
           }
           x.toString
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
   @@ -26,11 +50,27 @@ object Exercises {
        * Реализуйте функцию тремя разными способами, отличающимися тем как функция себя ведет на пустой коллекции.
        * Обратите внимание на возвращаемые типы.
        */
       def max1(xs: Seq[Int]): Int = {
           if (xs.isEmpty)
               -1
           else
               xs.max
       }

       def max2(xs: Seq[Int]): Seq[Int] = {
           if (xs.isEmpty)
               Seq.empty[Int]
           else
               Seq(xs.max)
       }

       def max3(xs: Seq[Int]): Option[Int] = {
           if (xs.isEmpty)
               None
           else
               Some(xs.max)
       }


       /**
        * Задание №3
   @@ -41,9 +81,12 @@ object Exercises {
       /**
        * Реализуйте на основе нее 3 варианта суммирования 2х чисел, отличающиеся способом передачи этих 2х чисел в функцию sumIntegers.
        * Как минимум одна из реализаций должна использовать тип данных (класс) написанный вами самостоятельно.
        */
        */
       def sum1(x: Int, y: Int): Int = sumIntegers(Seq(x, y))
       def sum2(x: Int, y: Int): Int = sumIntegers(Iterable(x, y))
       def sum3(x: Int, y: Int): Int = sumIntegers(new Couple(x, y))

       class Couple(x: Int, y: Int) extends Iterable[Int] {
           override def iterator: Iterator[Int] = Iterator(x, y)
       }
   }
   }
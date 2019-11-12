package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(22) == "22")
            assert(Exercises.prettyBooleanFormatter1("джаваскрипт") == "джаваскрипт")

            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(22) == "22")
            assert(Exercises.prettyBooleanFormatter2("джаваскрипт") == "джаваскрипт")

            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(22) == "22")
            assert(Exercises.prettyBooleanFormatter3("джаваскрипт") == "джаваскрипт")
        }
        'test_max - {
            assert(Exercises.max1(Seq[Int](-1, 0, 1)) == 1)
            assert(Exercises.max1(Seq[Int]()) == 0)

            assert(Exercises.max2(Seq[Int](-1, 0, 1)) == Seq[Int](1))
            assert(Exercises.max2(Seq[Int]()) == Nil)

            assert(Exercises.max3(Seq[Int](-1, 0, 1)) == Option[Int](1))
            assert(Exercises.max3(Seq[Int]()).isEmpty)
        }
        'test_sum - {
            assert(Exercises.sum1(-1, 1) == 0)
            assert(Exercises.sum2(-1, 1) == 0)
            assert(Exercises.sum3(-1, 1) == 0)
        }
    }
}

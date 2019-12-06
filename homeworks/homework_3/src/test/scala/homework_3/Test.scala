package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(2359) == "2359")
        }
        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(4.5) == "4.5")
        }
        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(List(4, 1, 6, 1)) == "List(4, 1, 6, 1)")
        }
        'test_max1 - {
            assert(Exercises.max1(Seq[Int](2, 3, 2000, 5, 9)) == 2000)
            assert(Exercises.max1(Seq[Int](-4, -1, -6, -1, -1, -1, -1, -1, -1, -124)) == -1)
            assert(Exercises.max1(Seq[Int]()) == 0)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq[Int](28, 37, 2070, 95, 99)) == Seq(2070))
            assert(Exercises.max2(Seq[Int](-4, -18, -66, -13, -155, -10, -1, 7)) == Seq(7))
            assert(Exercises.max2(Seq[Int]()) == Nil)
        }
        'test_max3 - {
            assert((Exercises.max3(Seq[Int](28, 37, 2070, 95, 99, 399, 3, 2000, 5, 9)) == Option[Int](2070)))
            assert((Exercises.max3(Seq[Int](-4, -18, -66, -13, -155, -10, -1, -7, -3, -2000, -5, -9)) == Option[Int](-1)))
            assert((Exercises.max3(Seq[Int]()) == None))
        }
        'test_sum1 - {
            assert(Exercises.sum1(23, 23) == 46)
            assert(Exercises.sum1(0, 0) == 0)
            assert(Exercises.sum1(24, -4) == 20)
        }
        'test_sum2 - {
            assert(Exercises.sum2(12, -2) == 10)
            assert(Exercises.sum2(-24, -24) == -48)
            assert(Exercises.sum2(52, -52) == 0)
        }
        'test_sum3 - {
            assert(Exercises.sum3(-13, 16) == 3)
            assert(Exercises.sum3(24, -24) == 0)
            assert(Exercises.sum3(-30, 10) == -20)
        }
    }
}

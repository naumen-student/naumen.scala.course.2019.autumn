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
            assert(Exercises.prettyBooleanFormatter1((2, 5)) == "(2,5)")
        }
        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(4.5) == "4.5")
        }
        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(List(2, 4, 5)) == "List(2, 4, 5)")
        }
        'test_max1 - {
            assert(Exercises.max1(Seq[Int](2, 3, 19, 5, -5)) == 19)
            assert(Exercises.max1(Seq[Int](-2, -1, -6, -8, -1)) == -1)
            assert(Exercises.max1(Seq[Int]()) == 0)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq[Int](2, 10, 3, 16, 11)) == Seq(16))
            assert(Exercises.max2(Seq[Int](-3, -2, -200, 58, -5)) == Seq(58))
            assert(Exercises.max2(Seq[Int]()) == Nil)
        }
        'test_max3 - {
            assert((Exercises.max3(Seq[Int](5, 2, 5400, 5401, 399)) == Option[Int](5401)))
            assert((Exercises.max3(Seq[Int](-230, -450, -189, -188)) == Option[Int](-188)))
            assert((Exercises.max3(Seq[Int]()) == None))
        }
        'test_sum1 - {
            assert(Exercises.sum1(12, 23) == 35)
            assert(Exercises.sum1(0, 54) == 54)
            assert(Exercises.sum1(24, -7) == 17)
        }
        'test_sum2 - {
            assert(Exercises.sum2(12, -14) == -2)
            assert(Exercises.sum2(-24, -12) == -36)
            assert(Exercises.sum2(52, -52) == 0)
        }
        'test_sum3 - {
            assert(Exercises.sum3(-13, 16) == 3)
            assert(Exercises.sum3(24, 6) == 30)
            assert(Exercises.sum3(-32, 14) == -18)
        }
    }
}

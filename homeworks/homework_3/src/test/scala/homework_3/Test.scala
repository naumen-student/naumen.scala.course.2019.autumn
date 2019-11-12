package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests {
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(100) == "100")
        }

        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(100) == "100")
        }

        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(100) == "100")
        }
        'test_max_1 - {
            assert(Exercises.max1(Seq(22, 45, 78, 34, 1, 56)) == 78)
            assert(Exercises.max1(Seq.empty[Int]) == 0)
            assert(Exercises.max1(Seq(100, 159, 267, 567, -321)) == 567)
        }
        'test_max_2 - {
            assert(Exercises.max2(Seq(22, 45, 78, 34, 1, 56)) == Seq(78))
            assert(Exercises.max2(Seq.empty[Int]) == Seq.empty[Int])
            assert(Exercises.max2(Seq(100, 159, 267, 567, -321)) == Seq(567))
        }
        'test_max_3 - {
            assert(Exercises.max3(Seq(-234, -435, 1)) == Some(1))
            assert(Exercises.max3(Seq.empty[Int]) == None)
            assert(Exercises.max3(Seq(22, 45, 78, 34, 1, 56)) == Some(78))

        }
        'test_sum1 - {
            assert(Exercises.sum1(23, 27) == 50)
            assert(Exercises.sum1(100, 0) == 100)
            assert(Exercises.sum1(500, 55) == 555)
        }

        'test_sum2 - {
            assert(Exercises.sum2(23, 27) == 50)
            assert(Exercises.sum2(100, 0) == 100)
            assert(Exercises.sum2(500, 55) == 555)
        }
        'test_sum3 - {
            assert(Exercises.sum3(23, 27) == 50)
            assert(Exercises.sum3(100, 0) == 100)
            assert(Exercises.sum3(500, 55) == 555)
        }
    }
}
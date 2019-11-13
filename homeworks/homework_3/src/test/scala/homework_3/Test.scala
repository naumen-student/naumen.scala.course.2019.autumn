package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter1_true - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
        'test_prettyBooleanFormatter1_false - {
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter1(false) == falseStr)
        }
        'test_prettyBooleanFormatter1_int - {
            assert(Exercises.prettyBooleanFormatter1(55) == "55")
        }

        'test_prettyBooleanFormatter2_true - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter2(true) == trueStr)
        }
        'test_prettyBooleanFormatter2_false - {
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter2(false) == falseStr)
        }
        'test_prettyBooleanFormatter2_float - {
            assert(Exercises.prettyBooleanFormatter2(55.2) == "55.2")
        }

        'test_prettyBooleanFormatter3_true - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter3(true) == trueStr)
        }
        'test_prettyBooleanFormatter3_false - {
            val falseStr = "ложь"
            assert(Exercises.prettyBooleanFormatter3(false) == falseStr)
        }
        'test_prettyBooleanFormatter3_string - {
            assert(Exercises.prettyBooleanFormatter3("qwerty") == "qwerty")
        }

        'test_max1_empty - {
            assert(Exercises.max1(Seq.empty[Int]) == -1)
        }
        'test_max1_positive - {
            assert(Exercises.max1(Seq(1,2,3)) == 3)
        }
        'test_max1_negative - {
            assert(Exercises.max1(Seq(-1,-2,-3)) == -1)
        }

        'test_max2_empty - {
            assert(Exercises.max2(Seq.empty[Int]).isEmpty)
        }
        'test_max2_positive - {
            assert(Exercises.max2(Seq(1,2,3)).contains(3))
        }
        'test_max2_negative - {
            assert(Exercises.max2(Seq(-1,-2,-3)).contains(-1))
        }

        'test_max3_empty - {
            assert(Exercises.max3(Seq.empty[Int]).isEmpty)
        }
        'test_max3_positive - {
            assert(Exercises.max3(Seq(1,2,3)).contains(3))
        }
        'test_max3_negative - {
            assert(Exercises.max3(Seq(-1,-2,-3)).contains(-1))
        }

        'test_sum1_positive - {
            assert(Exercises.sum1(1, 2) == 3)
        }
        'test_sum1_negative - {
            assert(Exercises.sum1(1, -2) == -1)
        }
        'test_sum1_zero - {
            assert(Exercises.sum1(2, -2) == 0)
        }

        'test_sum2_positive - {
            assert(Exercises.sum2(1, 20) == 21)
        }
        'test_sum2_negative - {
            assert(Exercises.sum2(1, -20) == -19)
        }
        'test_sum2_zero - {
            assert(Exercises.sum2(20, -20) == 0)
        }

        'test_sum3_positive - {
            assert(Exercises.sum3(10, 2) == 12)
        }
        'test_sum3_negative - {
            assert(Exercises.sum3(-10, 2) == -8)
        }
        'test_sum3_zero - {
            assert(Exercises.sum3(20, -20) == 0)
        }
    }
}

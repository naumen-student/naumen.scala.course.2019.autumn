package homework_3

import utest._

object Test extends TestSuite {

    val tests = Tests {
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(1) == "1")
        }

        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(1) == "1")
        }

        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(1) == "1")
        }
        'test_max1 - {
            assert(Exercises.max1(Seq(22, 25, 32, 11, 41, 14)) == 41)
            assert(Exercises.max1(Seq.empty[Int]) == 0)
            assert(Exercises.max1(Seq(120, 121, -121)) == 121)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq(22, 25, 32, 11, 41, 14)) == Seq(41))
            assert(Exercises.max2(Seq.empty[Int]) == Seq.empty[Int])
            assert(Exercises.max2(Seq(120, 121, -121)) == Seq(121))
        }
        'max3 - {
            assert(Exercises.max3(Seq(100)) == Some(100))
            assert(Exercises.max3(Seq.empty[Int]) == None)
            assert(Exercises.max3(Seq(1, 10, 20, 30, 40, 50)) == Some(50))

        }
        'test_sum1 - {
            assert(Exercises.sum1(1, 1) == 2)
            assert(Exercises.sum1(100, 101) == 201)
            assert(Exercises.sum1(50000, 11111) == 61111)
        }

        'test_sum2 - {
            assert(Exercises.sum2(1, 1) == 2)
            assert(Exercises.sum2(100, 101) == 201)
            assert(Exercises.sum2(50000, 11111) == 61111)
        }
        'test_sum3 - {
            assert(Exercises.sum3(1, 1) == 2)
            assert(Exercises.sum3(100, 101) == 201)
            assert(Exercises.sum3(50000, 11111) == 61111)
        }
    }
}
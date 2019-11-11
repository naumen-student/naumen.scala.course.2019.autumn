package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter1 - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(0) == "0")
        }

        'test_prettyBooleanFormatter2 - {
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(0) == "0")
        }

        'test_prettyBooleanFormatter3 - {
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(0) == "0")
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(20, 101, 94, 15)) == 101)
            assert(Exercises.max1(Seq(-506, 0, 100081)) == 100081)
            assert(Exercises.max1(Seq()) == 0)
        }

        'test_max2 - {
            assert(Exercises.max2(Seq(20, 101, 94, 15)) == Seq(101))
            assert(Exercises.max2(Seq(-506, 0, 100081)) == Seq(100081))
            assert(Exercises.max2(Seq()) == Nil)
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(20, 101, 94, 15)) == Option(101))
            assert(Exercises.max3(Seq(-506, 0, 100081)) == Option(100081))
            assert(Exercises.max3(Seq()) == None)
        }

        'test_sum1 - {
            assert(Exercises.sum1(2, 3) == 5)
            assert(Exercises.sum1(10001, 10001) == 20002)
            assert(Exercises.sum1(150, 500) == 650)
        }

        'test_sum2 - {
            assert(Exercises.sum2(2, 3) == 5)
            assert(Exercises.sum2(10001, 10001) == 20002)
            assert(Exercises.sum2(150, 500) == 650)
        }

        'test_sum3 - {
            assert(Exercises.sum3(2, 3) == 5)
            assert(Exercises.sum3(10001, 10001) == 20002)
            assert(Exercises.sum3(150, 500) == 650)
        }
    }
}

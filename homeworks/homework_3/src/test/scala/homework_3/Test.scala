package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests {
        'test_prettyBooleanFormatter - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(123) == "123")
            assert(Exercises.prettyBooleanFormatter1("RazDvaTri") == "RazDvaTri")

            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(123) == "123")
            assert(Exercises.prettyBooleanFormatter2("RazDvaTri") == "RazDvaTri")

            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(123) == "123")
            assert(Exercises.prettyBooleanFormatter3("RazDvaTri") == "RazDvaTri")
        }
        'test_max - {
            assert(Exercises.max1(Seq[Int](14, 0, 88)) == 88)
            assert(Exercises.max1(Seq[Int]()) == 0)

            assert(Exercises.max2(Seq[Int](-50, 490, 50)) == Seq[Int](490))
            assert(Exercises.max2(Seq[Int]()) == Nil)

            assert(Exercises.max3(Seq[Int](1000, 1110, 100)) == Option[Int](1110))
            assert(Exercises.max3(Seq[Int]()).isEmpty)
        }
        'test_sum - {
            assert(Exercises.sum1(-41, 40) == -1)
            assert(Exercises.sum2(-1, 1) == 0)
            assert(Exercises.sum3(14, 88) == 102)
        }
    }
}

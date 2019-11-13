package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_prettyBooleanFormatter - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(2132131) == "2132131")
            assert(Exercises.prettyBooleanFormatter1("teststring") == "teststring")

            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2(2132131) == "2132131")
            assert(Exercises.prettyBooleanFormatter2("teststring") == "teststring")

            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(2132131) == "2132131")
            assert(Exercises.prettyBooleanFormatter3("teststring") == "teststring")
        }
        'test_max - {
            assert(Exercises.max1(Seq[Int](-23, 0, 4, 34, 324, 435)) == 435)
            assert(Exercises.max1(Seq[Int]()) == 0)

            assert(Exercises.max2(Seq[Int](-23, 0, 4, 34, 324, 435)) == Seq[Int](435))
            assert(Exercises.max2(Seq[Int]()) == Nil)

            assert(Exercises.max3(Seq[Int](-23, 0, 4, 34, 324, 435)) == Option[Int](435))
            assert(Exercises.max3(Seq[Int]()).isEmpty)
        }
        'test_sum - {
            assert(Exercises.sum1(-10, 10) == 0)
            assert(Exercises.sum2(-10, 10) == 0)
            assert(Exercises.sum3(-10, 10) == 0)
        }
    }
}

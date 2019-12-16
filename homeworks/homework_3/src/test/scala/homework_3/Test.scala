package homework_3

import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_example - {
            val trueStr = "правда"
            assert(Exercises.prettyBooleanFormatter1(true) == trueStr)
        }
        'test_prettyBooleanFormatter - {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(16) == "16")
            assert(Exercises.prettyBooleanFormatter2(true) == "правда")
            assert(Exercises.prettyBooleanFormatter2(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter2((1, 5, 7)) == "(1,5,7)")
            assert(Exercises.prettyBooleanFormatter3(true) == "правда")
            assert(Exercises.prettyBooleanFormatter3(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter3(List(3, 5, 8, 9)) == "List(3, 5, 8, 9)")
        }
        'test_max - {
            assert(Exercises.max1(Seq[Int](1, 6, 7, 8, 8, 1)) == 8)
            assert(Exercises.max1(Seq[Int](2, 6, -10, 0, 2)) == 6)
            assert(Exercises.max1(Seq[Int]()) == 0)
            assert(Exercises.max2(Seq[Int](4421, 412, 5123, 532)) == List(5123))
            assert(Exercises.max2(Seq[Int](-3232, 232, 342, 23)) == List(342))
            assert(Exercises.max2(Seq[Int]()) == Nil)
            assert((Exercises.max3(Seq[Int](123, 32432, 5324, 324)) == Option[Int](32432)))
            assert((Exercises.max3(Seq[Int](4324, -32432, 2, 111)) == Option[Int](4324)))
            assert((Exercises.max3(Seq[Int]()) == None))
        }
        'test_sum - {
            assert(Exercises.sum1(2, 5) == 7)
            assert(Exercises.sum1(-2, 2) == 0)
            assert(Exercises.sum1(7, -8) == -1)
            assert(Exercises.sum2(123, 11) == 134)
            assert(Exercises.sum2(11, -11) == 0)
            assert(Exercises.sum2(531, -540) == -9)
            assert(Exercises.sum3(321, 12) == 333)
            assert(Exercises.sum3(-21, 21) == 0)
            assert(Exercises.sum3(10, -14) == -4)
        }
    }
}

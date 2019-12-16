import utest._

object Test extends TestSuite{

    val tests = Tests{

        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 10) == 33)
            assert(Exercises.sumOfDivBy3Or5(5, 13) == 42)
            assert(Exercises.sumOfDivBy3Or5(2, 30) == 225)
        }

        'primeFactor - {
            assert(Exercises.primeFactor(84) == Seq(2, 3, 7))
            assert(Exercises.primeFactor(75) == Seq(3, 5))
            assert(Exercises.primeFactor(140) == Seq(2, 5, 7))
        }

        'test_sumScalars - {
            val leftVec0 = Exercises.Vector2D(1, 0)
            val leftVec1 = Exercises.Vector2D(0, 1)
            val rightVec0 = Exercises.Vector2D(2, 3)
            val rightVec1 = Exercises.Vector2D(4, 5)
            assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == 23)
        }

        'test_sumCosines - {
            val leftVec0 = Exercises.Vector2D(2, 0)
            val leftVec1 = Exercises.Vector2D(3, 0)
            val rightVec0 = Exercises.Vector2D(2, 3)
            val rightVec1 = Exercises.Vector2D(2, 3)
            assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == 2)
        }

        'sortByHeavyweight - {
        assert(Exercises.sortByHeavyweight(
            Map(
                "Lithium" ->  (12,  0.534), "Tungsten" ->  (3,   2),   "Iron" ->      (7,   2),
                "Potassium" -> (14,  2), "Calcium" ->   (8,   2),  "Cobalt" ->    (4,   2)) )
          == Seq("Tungsten", "Cobalt", "Lithium", "Iron", "Calcium", "Potassium"))
        }
    }
}

import utest._

object Test extends TestSuite {

    val tests = Tests {
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5, 9) == 22)
            assert(Exercises.sumOfDivBy3Or5(1, 30) == 225)
        }
        'primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(1782) == Seq(2, 3, 11))
        }
        'test_sumScalars - {
            val leftVec0 = Exercises.Vector2D(1, 0)
            val leftVec1 = Exercises.Vector2D(1, 1)
            val rightVec0 = Exercises.Vector2D(2, 1)
            val rightVec1 = Exercises.Vector2D(2, 1)
            assert(Exercises.sumScalars(leftVec0, leftVec1, rightVec0, rightVec1) == 6)
        }
        'test_sumCosines - {
            val leftVec0 = Exercises.Vector2D(2, 0)
            val leftVec1 = Exercises.Vector2D(2, 5)
            val rightVec0 = Exercises.Vector2D(-1, 0)
            val rightVec1 = Exercises.Vector2D(2, 0)
            assert(Exercises.sumCosines(leftVec0, leftVec1, rightVec0, rightVec1) == 0)
        }
        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(
                Map(
                    "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Silver" ->    (4,   4.505), "Uranium" ->   (2,   19.04),
                    "Chrome" ->   (3,   7.18),   "Cesium" ->    (7,   1.873), "Zirconium" -> (3,   6.45)))
              == Seq("Cesium", "Silver", "Zirconium", "Titanium", "Chrome", "Lead", "Uranium"))
    }
}

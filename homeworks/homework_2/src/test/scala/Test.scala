import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 4) == 3)
            assert(Exercises.sumOfDivBy3Or5(19, 20) == 20)
            assert(Exercises.sumOfDivBy3Or5(13, 31) == 180)
            assert(Exercises.sumOfDivBy3Or5(-10, 10) == 0)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(503) == Seq(503))
            assert(Exercises.primeFactor(128) == Seq(2))
            assert(Exercises.primeFactor(1050) == Seq(2, 3, 5, 7))
        }

        'test_sumScalars - {
            assert(Exercises.sumScalars(Vector2D(5, -4), Vector2D(2, 1), Vector2D(0, 3), Vector2D(7, -1)) == 3.0)
            assert(Exercises.sumScalars(Vector2D(5, 2), Vector2D(4, -1), Vector2D(0, 3), Vector2D(3, 0)) == 18.0)
        }

        'test_sumCosines - {
            assert(Exercises.sumCosines(Vector2D(3, 4), Vector2D(4, 3), Vector2D(3, 0), Vector2D(3, 0)) == 1.96)
        }

        'test_sumCosines - {
            val testMap1 = Map("Tin" -> (1,   7.29), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1))
            val correctSortedMap1 = Seq("Tin", "Tungsten", "Graphite")
            assert(Exercises.sortByHeavyweight(testMap1) == correctSortedMap1)

            val testMap2 = Exercises.balls
            val correctSortedMap2 = Seq(
                "Tin","Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold",
                "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt",
                "Cesium", "Calcium","Lithium", "Magnesium", "Potassium", "Graphite"
            )
            assert(Exercises.sortByHeavyweight(testMap2) == correctSortedMap2)
        }
    }
}

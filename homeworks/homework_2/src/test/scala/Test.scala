import utest._
import Exercises.Vector2D

object Test extends TestSuite {

    val tests = Tests {
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 12) == 45)
            assert(Exercises.sumOfDivBy3Or5(6, 23) == 111)
            assert(Exercises.sumOfDivBy3Or5(7, 9) == 9)
        }
        'primeFactor - {
            assert(Exercises.primeFactor(4)  == Seq(2))
            assert(Exercises.primeFactor(96) == Seq(2, 3))
            assert(Exercises.primeFactor(4205) == Seq(5, 29))
        }
        'sumScalars - {
            assert(Exercises.sumScalars(Vector2D(2, -1), Vector2D(3, 8), Vector2D(0, 6), Vector2D(-2, 4)) == 22.0)
            assert(Exercises.sumScalars(Vector2D(6, 2), Vector2D(-3, 10), Vector2D(2, 3), Vector2D(2, 9)) == 33.0)
            assert(Exercises.sumScalars(Vector2D(-6, 2), Vector2D(5, 6), Vector2D(2, -3), Vector2D(7, 14)) == -46.0)
        }
        'sumCosines - {
            assert(Exercises.sumCosines(Vector2D(2, -1), Vector2D(3, 8), Vector2D(0, 6), Vector2D(-2, 4)) == 0.7897424064818731)
            assert(Exercises.sumCosines(Vector2D(6, 2), Vector2D(-3, 10), Vector2D(2, 3), Vector2D(2, 9)) == 0.9628572249148587)
            assert(Exercises.sumCosines(Vector2D(-6, 2), Vector2D(5, 6), Vector2D(2, -3), Vector2D(7, 14)) == -0.8605382869373461)
        }
        'sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(
                Map(
                    "Aluminum" -> (3, 2.6889), "Tungsten" -> (2, 19.35), "Graphite" -> (12, 2.1), "Iron" -> (3, 7.874),
                    "Gold" -> (2, 19.32), "Potassium" -> (14, 0.862), "Calcium" -> (8, 1.55), "Cobalt" -> (4, 8.90),
                    "Nickel" -> (2, 8.91), "Tin" -> (1, 7.29), "Platinum" -> (1, 21.45), "Plutonium" -> (3, 19.25),
                    "Chrome" -> (3, 7.18), "Cesium" -> (7, 1.873), "Zirconium" -> (3, 6.45)
                ))
              == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Plutonium", "Cobalt", "Cesium",
                "Calcium", "Potassium", "Graphite"))
            assert(Exercises.sortByHeavyweight(
                Map(
                    "Aluminum" -> (3, 2.6889), "Tungsten" -> (2, 19.35),
                    "Calc" +
                      "ium" -> (8, 1.55), "Cobalt" -> (4, 8.90),
                    "Nickel" -> (2, 8.91), "Tin" -> (1, 7.29),
                    "Chrome" -> (3, 7.18), "Cesium" -> (7, 1.873)))
              == Seq("Tin", "Nickel", "Aluminum", "Tungsten", "Chrome", "Cobalt", "Cesium", "Calcium"))

        }

    }
}

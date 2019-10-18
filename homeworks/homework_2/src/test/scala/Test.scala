import Exercises.Vector2D
import utest._

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5, 9) == 20)
            assert(Exercises.sumOfDivBy3Or5(0, 1) == 0)
            assert(Exercises.sumOfDivBy3Or5(10, 50) == 570)
        }

        'primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(1) == Seq())
            assert(Exercises.primeFactor(978653) == Seq(13, 83, 907))
            assert(Exercises.primeFactor(978647) == Seq(978647))
        }

        'sumScalars - {
            val v1 = new Vector2D(1,0)
            val v2 = new Vector2D(0,1)
            val v3 = new Vector2D(2,0)
            val v4 = new Vector2D(3,0)
            val v5 = new Vector2D(2,3)
            val v6 = new Vector2D(4,5)
            assert(Exercises.sumScalars(v1,v2, v3, v4) == 6)
            assert(Exercises.sumScalars(v1,v2, v5, v6) == 23)
        }

        'sumCosines - {
          val v1 = new Vector2D(1,0)
          val v2 = new Vector2D(0,1)
          val v3 = new Vector2D(2,0)
          val v4 = new Vector2D(3,0)
          val v5 = new Vector2D(2,3)
          val v6 = new Vector2D(4,5)
          assert(Exercises.sumCosines(v1,v2, v3, v4) == 1)
          assert(Exercises.sumCosines(v3,v4, v5, v6) == 1.996240588195683)
          assert(Exercises.sumCosines(v3,v4, v5, v5) == 2)
        }

        'sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(
                Map(
                "Aluminum" -> (3,   2), "Tungsten" ->  (5,   2), "Graphite" ->  (12,  2),   "Iron" ->      (7,   2),
                "Gold" ->     (2,   2),  "Potassium" -> (14,  2), "Calcium" ->   (8,   2),  "Cobalt" ->    (4,   2)) )
              == Seq("Gold","Aluminum", "Cobalt", "Tungsten",  "Iron", "Calcium", "Graphite", "Potassium"))
            assert(Exercises.sortByHeavyweight(
                Map(
                  "Nickel" ->   (2,   8.91),   "Tin" ->       (1,   7.29),  "Platinum" ->  (1,   21.45), "Plutonium" -> (3,   19.25),
                  "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Silver" ->    (4,   4.505), "Uranium" ->   (2,   19.04),
                  "Chrome" ->   (3,   7.18),   "Cesium" ->    (7,   1.873), "Zirconium" -> (3,   6.45)) )
              == Seq("Tin","Platinum", "Nickel", "Titanium",  "Lead", "Uranium", "Zirconium", "Chrome", "Silver", "Plutonium", "Cesium" ))
            assert(Exercises.sortByHeavyweight(
                Map(
                  "Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874),
                  "Gold" ->     (2,   19.32),  "Potassium" -> (14,  0.862), "Calcium" ->   (8,   1.55),  "Cobalt" ->    (4,   8.90)))
              == Seq("Aluminum","Gold", "Tungsten", "Iron", "Cobalt", "Calcium", "Potassium","Graphite"  ))
            assert(Exercises.sortByHeavyweight(
                Map(
                  "Lithium" ->  (12,  0.534),  "Magnesium" -> (10,  1.738), "Copper" ->    (3,   8.96),  "Sodium" ->    (5,   0.971),
                  "Nickel" ->   (2,   8.91),   "Tin" ->       (1,   7.29),  "Platinum" ->  (1,   21.45), "Plutonium" -> (3,   19.25)))
              == Seq("Tin","Platinum", "Nickel", "Sodium", "Copper", "Plutonium", "Lithium","Magnesium" ))
            assert(Exercises.sortByHeavyweight(
                Map(
                  "Aluminum" -> (3,   2.6889), "Tungsten" ->  (2,   19.35), "Graphite" ->  (12,  2.1),   "Iron" ->      (3,   7.874),
                  "Gold" ->     (2,   19.32),  "Potassium" -> (14,  0.862), "Calcium" ->   (8,   1.55),  "Cobalt" ->    (4,   8.90),
                  "Lithium" ->  (12,  0.534),  "Magnesium" -> (10,  1.738), "Copper" ->    (3,   8.96),  "Sodium" ->    (5,   0.971),
                  "Nickel" ->   (2,   8.91),   "Tin" ->       (1,   7.29),  "Platinum" ->  (1,   21.45), "Plutonium" -> (3,   19.25),
                  "Lead" ->     (2,   11.336), "Titanium" ->  (2,   10.50), "Silver" ->    (4,   4.505), "Uranium" ->   (2,   19.04),
                  "Chrome" ->   (3,   7.18),   "Cesium" ->    (7,   1.873), "Zirconium" -> (3,   6.45)))
              == Seq("Tin","Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome",
              "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium","Lithium", "Magnesium", "Potassium", "Graphite"))
            assert(Exercises.sortByHeavyweight(
              Map(
              "Aluminum" -> (3,   2), "Tungsten" ->  (3,   2), "Graphite" ->  (12,  2),   "Iron" ->      (7,   2),
              "Gold" ->     (2,   2),  "Potassium" -> (14,  2), "Calcium" ->   (8,   2),  "Cobalt" ->    (4,   2)) )
              == Seq("Gold","Tungsten", "Aluminum", "Cobalt", "Iron", "Calcium", "Graphite", "Potassium"))
        }
    }
}

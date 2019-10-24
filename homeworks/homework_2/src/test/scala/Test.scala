import utest._

object Test extends TestSuite{
	val EPS = 1e-6
    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }
        'sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 20) == 98)
            assert(Exercises.sumOfDivBy3Or5(0, 10) == 33)
            assert(Exercises.sumOfDivBy3Or5(0, 0) == 0)
        }
        'primeFactor - {
        	assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7)) 
        }
        'sumScalars - {
        	assert(Math.abs(
        			Exercises.sumScalars(
        				Exercises.Vector2D(2, -1), 
        				Exercises.Vector2D(3, 8), 
        				Exercises.Vector2D(0, 6), 
        				Exercises.Vector2D(-2, 4)) - 22) < EPS
        	)
        	assert(Math.abs(
        			Exercises.sumScalars(
        				Exercises.Vector2D(1, 0), 
        				Exercises.Vector2D(2, 1),
		                Exercises.Vector2D(3, 2), 
		                Exercises.Vector2D(4, 3)) - 20) < EPS
        	)

        }
        'sumCosines - {
            assert(Math.abs(
            		Exercises.sumCosines(
            			Exercises.Vector2D(-1, -1), 
            			Exercises.Vector2D(1, 1),
		                Exercises.Vector2D(0, 1), 
		                Exercises.Vector2D(0, 8))) < EPS)
        }
        'sortByHeavyWeight - {
        	val testBalls: Map[String, (Int, Double)] =
                Map(
                    "Adamantium" ->  (10,  9999.99), 
                    "Oak" -> (10,  0.76), 
                    "Alluminium" -> (10,   2.6889),
                    "Steel" ->    (10,   7.85),  
                    "Uranium" ->   (10,   19.04)
                )
            assert(Exercises.sortByHeavyWeight(testBalls) == Seq("Oak", "Alluminium", "Steel", "Uranium", "Adamantium"))
        }
    }
}

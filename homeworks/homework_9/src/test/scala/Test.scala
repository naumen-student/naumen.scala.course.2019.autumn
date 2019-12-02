import utest._

object Test extends TestSuite {

    override val tests: Tests = Tests {
        'flatMap - {

            val flatMapImpl = new ListFlatMap {
                override protected def map[A, B](f: A => B): Seq[A] => Seq[B] = _.map(f)
                override protected def flatten[A]: Seq[Seq[A]] => Seq[A] = _.flatten
            }

            val f = (x: Int) => List(x, x + 1, x + 2)
            val inputList  = List.fill(10)(util.Random.nextInt)

            assert(flatMapImpl.flatMap(f)(inputList) == inputList.flatMap(f))
        }

        'tailrecFilter - {
            val evens = (_: Int) % 2 == 0
            val filterImpl = new ListFilter {}.tailrecFilter[Int](evens)

            def checkLogic = {
                val smallInput = 0 to 100
                filterImpl(smallInput) == smallInput.filter(evens)
            }
            assert(checkLogic)
        }

        'digitalRoot - {
            val digitalRootImpl = new DigitalRoot {}.findRoot _

            assert(digitalRootImpl(42) == 6)
            assert(digitalRootImpl(99) == 9)
            assert(digitalRootImpl(100) == 1)
            assert(digitalRootImpl(12345) == 6)
        }


    }

}

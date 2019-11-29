package naumen.practice_2

import utest._

object Test extends TestSuite {

    val tests = Tests {
        'test_for_test - {
            assert("".isEmpty)
        }
    }
}

package naumen.practice_1

import utest._

object Test extends TestSuite {

    val tests = Tests {
        'test_for_test - {
            assert("".isEmpty)
        }
    }
}

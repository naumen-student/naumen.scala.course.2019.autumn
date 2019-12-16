package monads

sealed trait Maybe[A]

object Maybe extends Monad[Maybe] {
    override def flatMap[A, B]()
}

package monads

trait Monad[M[_]] extends Functor[M] {
    def flatMap[A, B](f: A => F[B]): F[A] => F[B]
    def unit[A](a: => A): F[A]
    def pure[A](a: A): F[A]
    
    override def map[A, B](f: A => B): F[A] => F[B] = flatMap(f andThen unit)
}
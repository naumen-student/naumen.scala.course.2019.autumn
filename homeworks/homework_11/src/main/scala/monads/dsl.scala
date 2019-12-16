package monads

object dsl {
    class FunctorDsl[F : Functor, A](functor: F[A]) {
        def map[B](f: A => B): F[B] = implicitly[Functor[F]].map(f)(funcor)
    }
    class MonadDsl[M : Monad, A](monad: M[A]) extends FunctorDsl[M, A](monad) {
        def flatMap[B](f: A => M[B]): M[B] = implicitly[Monad[M]].flatMap(f)(monad)
        override def map[B](f: A => B): M[B] = implicitly[Monad[M]].map(f)(monad)
    }

    object implicits {
        def functorDsl[F : Functor, A](functor: F[A]) = new FunctorDsl(functor)
        def monadDsl[M : Monad, A](monad: M[A]) = new MonadDsl(functor)
    }
}
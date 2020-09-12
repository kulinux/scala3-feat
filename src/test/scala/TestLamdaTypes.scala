import org.junit.Test

///No lo entiendo

trait Functor[F[_]]

type F1 = Functor[Option] // OK
type F2 = Functor[List]   // OK

//Before type lambdas
type IntKeyMap[A] = Map[Int, A]
type F3 = Functor[IntKeyMap]

//Type Lambdas, Int not in initial type
type IntKeyMap2[A] = [X] =>> Map[X, A] 
type F4 = Functor[IntKeyMap2[Int]]

class TestLambdaTypes {


    @Test def test() = {
        println("test");
    }
}
package matchtypes 

import org.junit.Test

case class A(a: String)
case class B(b: String)

case class AA(a: String, aa: String)
case class BB()

type Elem[X] = X match {
  case A => AA
  case B => BB 
}


class TestMatchTypes {
    def f[X](x: X): Elem[X] = x match {
        case a: A => AA(a.a, "vengo de a")
        case b: B => BB()
    }
    @Test def test() = {
        println("f(A) -> " + f(A("a")))
        println("f(A) -> " + f(B("a")))
    }

}
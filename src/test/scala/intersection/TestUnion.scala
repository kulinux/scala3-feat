package intersection

import org.junit.Test

case class A(a: String)
case class B(b: String)

class TestUnion {
    def show(ab: A | B): Unit = {
        ab match {
            case A(a) => println(s"a vale $a")
            case B(a) => println(s"b vale $a")
        }
    }


    @Test def test(): Unit = {
        val a = A("aa")
        val b = B("bb")
        val c: A | B = B("a|b")
        show(a)
        show(b)
        show(c)
        println("test()")
        val ab : A | B = if(true) A("ifa") else B("ifb")
    }
}
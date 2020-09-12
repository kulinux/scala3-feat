trait A {
    def a(): Unit
}
trait B {
    def b(): Unit
}

class AB extends A with B {
    def a(): Unit = {
        println("a()")
    }

    def b(): Unit = {
        println("b()")
    }

}

object Intersection {
    def method(ab: A & B) = {
        ab.a();
        ab.b();
    }

    def run() = {
        val ab: A & B = new AB()
        method(ab)
        println("Run")
    }
}
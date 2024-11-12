import org.scalatest.funsuite.AnyFunSuite

class ConditionalSuite extends AnyFunSuite {
  test("x greater than 5") {
    val x = 10
    assert(x > 5) // Assertion to check the condition
  }

  test("x less than 5") {
    val x = 2
    assert(x < 5)
  }
}

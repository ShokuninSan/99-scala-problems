import org.scalatest._
import arithmetic.S99Int._

class P32Spec extends FlatSpec with Matchers {

  "gcd" should "determine the greatest common divisor of two positive integer numbers" in {
    gcd(36, 63) should equal (9)
  }

}

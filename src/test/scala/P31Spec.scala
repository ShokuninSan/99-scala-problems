import org.scalatest._
import arithmetic.S99Int._

class P31Spec extends FlatSpec with Matchers {

  "isPrime" should "determine whether a given integer number is prime" in {
    7.isPrime shouldBe (true)
    4.isPrime shouldBe (false)
  }

}

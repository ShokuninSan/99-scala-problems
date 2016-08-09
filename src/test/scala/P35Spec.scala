import org.scalatest._
import arithmetic.S99Int._

class P35Spec extends FlatSpec with Matchers {

  "primeFactors" should "determine the prime factors of a given positive integer" in {
    315.primeFactors should equal (List(3, 3, 5, 7))
  }

}

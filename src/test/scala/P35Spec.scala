import org.scalatest._
import arithmetic.S99Int._

class P35Spec extends FlatSpec with Matchers {

  "primeFactors" should "determine the prime factors of a given positive integer" in {
    for ((value, expectedFactors) <- List(
      (315, List(3, 3, 5, 7)),
      (105, List(3, 5, 7)),
      (1049, List(1049))))
      value.primeFactors should equal (expectedFactors)
  }

}

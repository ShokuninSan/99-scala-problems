import org.scalatest._
import arithmetic.S99Int._

class P36Spec extends FlatSpec with Matchers {

  "primeFactorMultiplicity" should "determine the prime factors and their multiplicity of a given positive integer" in {
    for ((value, expectedFactors) <- List(
      (315, List((3, 2), (5, 1), (7, 1))),
      (105, List((3, 1), (5, 1), (7, 1))),
      (1049, List((1049, 1)))))
      value.primeFactorMultiplicity should equal (expectedFactors)
  }

  "primeFactorMultiplicityMap" should "determine the prime factors and their multiplicity of a given positive integer" in {
    for ((value, expectedFactors) <- List(
      (315, Map(3 -> 2, 5 -> 1, 7 -> 1)),
      (105, Map(3 -> 1, 5 -> 1, 7 -> 1)),
      (1049, Map(1049 -> 1))))
      value.primeFactorMultiplicityMap should equal (expectedFactors)
  }

}

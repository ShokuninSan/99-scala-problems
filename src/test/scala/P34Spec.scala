import org.scalatest._
import arithmetic.S99Int._

class P34Spec extends FlatSpec with Matchers {

  "totient" should "the number of positive integers r (1 <= r <= m) that are coprime to m" in {
    10.totient should equal (4)
  }

}

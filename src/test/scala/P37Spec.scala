import org.scalatest._
import arithmetic.S99Int._

class P37Spec extends FlatSpec with Matchers {

  "totientImproved" should "the number of positive integers r (1 <= r <= m) that are coprime to m using prime factors and their multiplicity" in {
    10.totientImproved should equal (4)
  }

}

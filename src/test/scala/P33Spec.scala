import org.scalatest._
import arithmetic.S99Int._

class P33Spec extends FlatSpec with Matchers {

  "isCoprimeTo" should "determine whether two positive integer numbers are coprimes" in {
    35.isCoprimeTo(64) should equal (true)
  }

}

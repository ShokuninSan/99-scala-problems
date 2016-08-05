import org.scalatest._
import P12._

class P12Spec extends FlatSpec with Matchers {

  "decode" should "construct an uncompressed version" in {
    decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should equal (List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

}

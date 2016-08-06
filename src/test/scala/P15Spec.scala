import org.scalatest._
import P15._

class P15Spec extends FlatSpec with Matchers {

  "duplicateN" should "duplicate the elements of a list a given number of times" in {
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should equal (List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

}

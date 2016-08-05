import org.scalatest._
import P11._

class P11Spec extends FlatSpec with Matchers {

  "encodeModified" should "encode consecutive duplicates of elements as tuples except non-duplicates" in {
    encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

}

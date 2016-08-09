import org.scalatest._
import lists.P10._

class P10Spec extends FlatSpec with Matchers {

  "encode" should "encode consecutive duplicates of elements as tuples" in {
    encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

}

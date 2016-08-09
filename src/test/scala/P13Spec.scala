import org.scalatest._
import lists.P13._

class P13Spec extends FlatSpec with Matchers {

  "encodeDirect" should "encode consecutive duplicates of elements as tuples" in {
    encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

}

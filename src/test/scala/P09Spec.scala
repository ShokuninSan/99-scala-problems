import org.scalatest._
import lists.P09._

class P09Spec extends FlatSpec with Matchers {

  "pack" should "place repeated elements into sublists" in {
    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  "pack" should "return List(Nil) with Nil as parameter" in {
    pack(Nil) should equal (List(Nil))
  }

}

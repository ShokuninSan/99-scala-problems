import org.scalatest._
import P14._

class P14Spec extends FlatSpec with Matchers {

  "duplicate" should "duplicate the elements of a list" in {
    duplicate(List('a, 'b, 'c, 'c, 'd)) should equal (List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

  "duplicateFolded" should "duplicate the elements of a list" in {
    duplicateFolded(List('a, 'b, 'c, 'c, 'd)) should equal (List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

  "duplicateFlatMapped" should "duplicate the elements of a list" in {
    duplicateFlatMapped(List('a, 'b, 'c, 'c, 'd)) should equal (List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

}

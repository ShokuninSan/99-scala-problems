import org.scalatest._
import P16._

class P16Spec extends FlatSpec with Matchers {

  "drop" should "drop every Nth element from a list" in {
    drop(3,  List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal (List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }

  "dropTailRecursive" should "drop every Nth element from a list" in {
    dropTailRecursive(3,  List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal (List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }

  "dropZipped" should "drop every Nth element from a list" in {
    dropZipped(3,  List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should equal (List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }

}

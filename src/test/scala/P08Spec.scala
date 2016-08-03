import org.scalatest._

class P08Spec extends FlatSpec with Matchers with P08 {

  "compress" should "eliminate consecutive duplicates of list elements" in {
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List('a, 'b, 'c, 'a, 'd, 'e))
  }

  "compressRecursive" should "eliminate consecutive duplicates of list elements" in {
    compressRecursive(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) should equal (List('a, 'b, 'c, 'a, 'd, 'e))
  }

}

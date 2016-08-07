import scala.language.implicitConversions
import annotation._

package arithmetic {

  class S99Int(val start: Int) {

    def isPrime: Boolean =
      List.range(start-1, 1, -1).filter(i => (start % i) == 0).isEmpty

  }

  object S99Int {

    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

    @tailrec
    def gcd(a: Int, b: Int): Int =
      if (b == 0) a
      else gcd(b, a % b)

  }

}

import scala.language.implicitConversions
import annotation._

package arithmetic {

  class S99Int(val start: Int) {

    import S99Int._

    /**
     * P31 (**) Determine whether a given integer number is prime.
     * scala> 7.isPrime
     * res0: Boolean = true
     */
    def isPrime: Boolean =
      List.range(start-1, 1, -1).filter(i => (start % i) == 0).isEmpty

    /**
     * P33 (*) Determine whether two positive integer numbers are coprime.
     * Two numbers are coprime if their greatest common divisor equals 1.
     * scala> 35.isCoprimeTo(64)
     * res0: Boolean = true
     */
    def isCoprimeTo(r: Int): Boolean = gcd(start, r) == 1

    /**
     * P34 (**) Calculate Euler's totient function phi(m).
     * Euler's so-called totient function phi(m) is defined as the number of   p ositive   *integers r (1 <= r <= m) that are coprime to m.
     * scala> 10.totient
     * res0: Int = 4
     */
    def totient: Int = ???
  }

  object S99Int {
    implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

    /**
     * P32 (**) Determine the greatest common divisor of two positive integer  * numbers.
     * Use Euclid's algorithm.
     * scala> gcd(36, 63)
     * res0: Int = 9
     */
    @tailrec
    def gcd(a: Int, b: Int): Int =
      if (b == 0) a
      else gcd(b, a % b)

  }

}

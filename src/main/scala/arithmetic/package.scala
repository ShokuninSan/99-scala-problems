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
    def totient: Int = List.range(1, start, 1).filter(start.isCoprimeTo).length

    /** P35 (**) Determine the prime factors of a given positive integer.
     * Construct a flat list containing the prime factors in ascending order.
     * scala> 315.primeFactors
     * res0: List[Int] = List(3, 3, 5, 7)
     */
    def primeFactors: List[Int] = {
      // factorization tree algorithm see: https://www.khanacademy.org/math/in-sixth-grade-math/playing-numbers/prime-factorization/v/prime-factorization
      val primes = (2 to start).filter(x => x.isPrime && !x.isCoprimeTo(start)).toStream

      @tailrec
      def _do(n: Int, factors: List[Int]): List[Int] =
        primes.find(x => n % x == 0) match {
          case Some(factor) => _do(n / factor, factor :: factors)
          case _ => factors
        }

      _do(start, Nil).reverse
    }

    /**
     * P36 (**) Determine the prime factors of a given positive integer (2).
     * Construct a list containing the prime factors and their multiplicity.
     * scala> 315.primeFactorMultiplicity
     * res0: List[(Int, Int)] = List((3,2), (5,1), (7,1))
     */
    def primeFactorMultiplicity: List[(Int, Int)] =
      lists.P13.encodeDirect(start.primeFactors).map(_.swap)

    /**
     * P36 cont'd: Alternately, use a Map for the result.
     * scala> 315.primeFactorMultiplicity
     * res0: Map[Int,Int] = Map(3 -> 2, 5 -> 1, 7 -> 1)
     */
    def primeFactorMultiplicityMap: Map[Int, Int] =
      primeFactorMultiplicity.toMap

    /**
     * P37 (**) Calculate Euler's totient function phi(m) (improved).
     * See problem P34 for the definition of Euler's totient function. If the
     * list of the prime factors of a number m is known in the form of problem
     * P36 then the function phi(m>) can be efficiently calculated as follows:
     * Let [[p1, m1], [p2, m2], [p3, m3], ...] be the list of prime factors (and
     * their multiplicities) of a given number m. Then phi(m) can be calculated
     * with the following formula:
     *
     * phi(m) = (p1-1)*p1^(m1-1) * (p2-1)*p2^(m2-1) * (p3-1)*p3^(m3-1) * ...
     *
     * Note that ab stands for the bth power of a.
     */
    def totientImproved: Int =
      start
      .primeFactorMultiplicity
      .foldLeft(1.0)((acc, t) => acc * (t._1-1) * math.pow(t._1, (t._2-1)))
      .toInt

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

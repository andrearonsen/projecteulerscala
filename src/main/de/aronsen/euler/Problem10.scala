package de.aronsen.euler

class Problem10 {
  def calculateSumOfPrimesBelow(n: Int): Long = {
    2 + (3 to n by 2).foldLeft(0L)((s, i) => if (couldBePrime(i) && isPrime(i)) s + i else s)
  }

  def couldBePrime(n: Int) = calculatePrimesUpTo(200).forall(p => p == n || n % p != 0)

  def isPrime(n: Int) = (2 to Math.sqrt(n).toInt) forall (n % _ != 0)

  def calculatePrimesUpTo(n: Int): List[Int] = {
    def sieve(xs: List[Int]): List[Int] = {
      if (xs.isEmpty) return Nil

      val p = xs.head
      val filteredXs = xs.diff(xs.map(n => p * n))

      return p :: sieve(filteredXs.tail)
    }

    return sieve(List.range(2, n + 1))
  }
}

object RunProblem10 {
  def main(args: Array[String]) {
    val p10 = new Problem10
    println("Solution (n=10): " + p10.calculateSumOfPrimesBelow(10))
    println("Solution (n=1000): " + p10.calculateSumOfPrimesBelow(1000))
    println("Solution Problem 10 (n=2 million): " + p10.calculateSumOfPrimesBelow(2000000))
  }
}
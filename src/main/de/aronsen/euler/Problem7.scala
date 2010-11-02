package de.aronsen.euler

class Problem7 {
  def findTheNthPrimeNumber(n: Int): Int = naturals(2).filter(p => isPrime(p)).take(n).last

  def naturals(n: Int): Stream[Int] = Stream.cons(n, naturals(n + 1))
  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
}

object RunProblem7 {
  def main(args: Array[String]) {
    val p7 = new Problem7
    println("Solution (n=6): " + p7.findTheNthPrimeNumber(6))
    println("Solution Problem 7 (n=10001): " + p7.findTheNthPrimeNumber(10001))
  }
}
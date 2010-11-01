package de.aronsen.euler

import collection.immutable.Stream

class Problem3 {
  def calculateLargestPrimeFactor(n: Long): Long = {
    (2 until Math.sqrt(n).toInt).filter(p => (n % p == 0) && isPrime(p.toInt)).reverse.head
  }

  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)

}

object RunProblem {
  def main(args: Array[String]) {
    val p3 = new Problem3
    println("Largest Prime Factor of 13195: " + p3.calculateLargestPrimeFactor(13195))
    println("Largest Prime Factor of 600851475143: " + p3.calculateLargestPrimeFactor(600851475143L))
  }
}
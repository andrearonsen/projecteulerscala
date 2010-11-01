package de.aronsen.euler

class Problem1 {
  def sumOfNaturalNumbersBelowNThatAreMultiplesOf3Or5(n: Int) = {
    naturalNumbersBelow(n).filter(i => multipleOf3Or5(i)).foldLeft(0)(_ + _)
  }

  def multipleOf3Or5(i: Int): Boolean = multipleOf(i, 3) || multipleOf(i, 5)
  def multipleOf(n: Int, m: Int) = n % m == 0
  def naturalNumbersBelow(n: Int): Stream[Int] = naturals(1).take(n - 1)
  def naturals(n: Int): Stream[Int] = Stream.cons(n, naturals(n + 1))
}

object RunProblem1 {
  def main(args: Array[String]) {
    val p1 = new Problem1
    println("Solution n=10: " + p1.sumOfNaturalNumbersBelowNThatAreMultiplesOf3Or5(10))
    println("Solution Problem 1 n=1000: " + p1.sumOfNaturalNumbersBelowNThatAreMultiplesOf3Or5(1000))
  }
}
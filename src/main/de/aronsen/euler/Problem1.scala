package de.aronsen.euler

class Problem1 {

  def sumOfNaturalNumbersBelowNThatAreMultiplesOf3Or5(n: Int) = {
    naturalNumbersBelow(n).filter(i => multipleOf3Or5(i)).foldLeft(0)(_+_)
  }

  def multipleOf3Or5(i: Int): Boolean = {
    multipleOf(i, 3) || multipleOf(i, 5)
  }

  def multipleOf(n: Int, m: Int) = n % m == 0

  def naturalNumbersBelow(n: Int): Stream[Int] = {
    naturals(1).take(n-1)
  }

  def naturals(n: Int): Stream[Int] = Stream.cons(n, naturals(n + 1))
}
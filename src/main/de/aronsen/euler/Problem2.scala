package de.aronsen.euler

class Problem2 {
  def sumOfEvenFibonacciNumbersUnder4Million: Int = {
    fibonacci(1 :: 0 :: Nil, 4000000).filter(i => i % 2 == 0).foldLeft(0)(_+_)
  }

  def fibonacci(xs: List[Int], max: Int): List[Int] = {
    val nextFib = xs.head + xs.tail.head
    if (nextFib >= max) xs else fibonacci(nextFib :: xs, max)
  }

}
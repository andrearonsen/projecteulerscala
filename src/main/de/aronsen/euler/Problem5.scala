package de.aronsen.euler

class Problem5 {
  def findSmallestNumberDivisableByAllNumbersFrom1To20(): Int = {
    var n = 1
    while (!isDivisableByAllNumbersFrom1To20(n)) n = n + 1
    return n
  }

  def isDivisableByAllNumbersFrom1To20(n: Int) = (11 to 20).forall(p => n % p == 0)
}

object RunProblem5 {
  def main(args: Array[String]) {
    val p5 = new Problem5
    println("Solution Problem 5: " + p5.findSmallestNumberDivisableByAllNumbersFrom1To20)
  }
}
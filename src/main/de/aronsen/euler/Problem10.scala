package de.aronsen.euler

import collection.mutable.MutableList

class Problem10 {
  def calculateSumOfPrimesBelow(n: Int): Int = primesUpTo(n).sum

  def primesUpTo(n: Int): MutableList[Int] = {
    val m = Math.sqrt(n).toInt
    println(m)
    def sieve(xs: MutableList[Int]): MutableList[Int] = {
      if (xs.isEmpty || xs.head > m) return xs

      val p = xs.head
      val toRemove = xs.map(n => p * n)
      val filteredXs = xs.diff(toRemove)

      return sieve(filteredXs.tail) += p
    }


    val list: MutableList[Int] = new MutableList
    list ++= List.range(2, n + 1)

    List.range(2, Math.sqrt(n).toInt + 1).foreach(i => {
      if (list.contains(i)) {
        list.foreach(j => if (j > i && j % i == 0) list.update(j - 2, 0))
      }
    })

    //return sieve(list)
    return list
  }

}

object RunProblem10 {
  def main(args: Array[String]) {
    val p10 = new Problem10
    println("Solution (n=10): " + p10.calculateSumOfPrimesBelow(10))
    println("Solution (n=1000): " + p10.calculateSumOfPrimesBelow(20000))
    //println("Solution Problem 10 (n=2 million)" + p10.calculateSumOfPrimesBelow(2000000))
  }
}
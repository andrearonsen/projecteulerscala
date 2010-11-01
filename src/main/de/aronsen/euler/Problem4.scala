package de.aronsen.euler

import collection.immutable.IndexedSeq

class Problem4 {
  def findTheLargestPalindromeOfTwo3DigitNumbers(): Int = {
    (999 until 100 by -1).map(p => findLargestPalindrome(p)).max
  }

  def findLargestPalindrome(f2: Int): Int = {
    val palindromes: IndexedSeq[Int] = (999 until 100 by -1).map(f => f * f2).filter(p => isPalindrome(p.toString))
    if (palindromes.isEmpty) 0 else palindromes.max
  }

  def isPalindrome(s: String): Boolean = s.equals(s.reverse)
}

object RunProblem {
  def main(args: Array[String]) {
    val p4 = new Problem4
    println(p4.findTheLargestPalindromeOfTwo3DigitNumbers())
  }
}
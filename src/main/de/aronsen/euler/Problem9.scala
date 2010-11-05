package de.aronsen.euler

class Problem9 {
  def findProductOfPythagoreanTripletWhichSumsUpToThousand(): Int = {
    var mult = 0;
    (1 to 1000).foreach(a => (a + 1 to 1000).foreach(b => (b + 1 to 1000).foreach(c =>
      if (sumsUpToThousand(a, b, c) && isPythagoreanTriplet(a, b, c)) mult = a * b * c)))
    return mult
  }

  def sumsUpToThousand(a: Int, b: Int, c: Int) = a + b + c == 1000

  def isPythagoreanTriplet(a: Int, b: Int, c: Int): Boolean = a * a + b * b == c * c
}

object RunProblem9 {
  def main(args: Array[String]) {
    val p9 = new Problem9
    println("Solution Problem9: " + p9.findProductOfPythagoreanTripletWhichSumsUpToThousand)
  }
}
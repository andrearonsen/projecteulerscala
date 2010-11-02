package de.aronsen.euler

class Problem6 {
  def calculateDifferenceBetweenSquareOfSumsAndSumOfSquaresOfTheFirst100NaturalNumbers(): Int = {
    Math.pow((1 to 100).sum, 2).toInt - (1 to 100).map(i => i*i).foldLeft(0)(_+_)
  }
}

object RunProblem6 {
  def main(args: Array[String]) {
    val p6 = new Problem6
    println("Solution Problem 6: " + p6.calculateDifferenceBetweenSquareOfSumsAndSumOfSquaresOfTheFirst100NaturalNumbers)
  }
}
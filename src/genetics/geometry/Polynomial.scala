package genetics.geometry


object Polynomial {

  def costFunction(points: List[Point]): Polynomial => Double = {
    null
  }

  def incubator(genes: List[Double]): Polynomial = {
    null
  }

}

/**
  * Represents a polynomial given its coefficients ending with the constant coefficient
  *
  * Ex. new Polynomial(List(1.5, -2.2, 5)) represents 1.5*pow(x, 2) - 2.2*x + 5
  *
  */
class Polynomial(var coefficients: List[Double]) {

  def evaluate(x: Double): Double = {
    0.0
  }

}

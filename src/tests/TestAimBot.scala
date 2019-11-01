package tests

import genetics.aimbot.AimBot
import org.scalatest.FunSuite

class TestAimBot extends FunSuite {

  val EPSILON: Double = 0.05

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }


  test("Genetic Algorithms Hits a Moving target") {
    // use this to get the number of genes to use.
    // Do not hardcode a value since the solutions in AutoGrader might not use that value
    AimBot.numberOfDimensions
  }

}

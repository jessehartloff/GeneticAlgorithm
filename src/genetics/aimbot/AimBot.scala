package genetics.aimbot

object AimBot{

  // set this to the number of genes you'll use in your incubator method
  val numberOfDimensions: Int = 0

  // Any returned velocity must have this magnitude
  // do not change this value
  val projectileSpeed: Double = 7.0


  def costFunction(sourceLocation: PhysicsVector, targetLocation: PhysicsVector, targetVelocity: PhysicsVector): PhysicsVector => Double = {
    null
  }


  def incubator(genes: List[Double]): PhysicsVector = {
    null
  }

}

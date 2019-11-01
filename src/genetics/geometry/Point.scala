package genetics.geometry

class Point(var x: Double, var y: Double) {

  override def toString: String = {
    f"($x%1.3f, $y%1.3f)"
  }

}

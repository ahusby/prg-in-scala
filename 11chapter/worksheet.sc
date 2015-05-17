class Point(val x: Int, val y: Int)

trait Rectangular {
  val topLeft: Point
  val bottomRight: Point

  val left = topLeft.x
  val right = bottomRight.x
  val width = right - left

  override val toString = "l:" + left + ", r:" + right
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular

val r = new Rectangle(new Point(5,5), new Point(10,10))



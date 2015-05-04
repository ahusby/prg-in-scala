def sum(x: Int, y: Int, z: Int) = "" + x + y + z
val f = sum _
f(1,2,3)

val f2 = sum(1, (_: Int), 3)
f2(2)


val ssum = "" + (_: Int) + (_: Int) + (_: Int)
val g = ssum
g(2,3,4)

val g2 = g(2, (_: Int), 4)
g2(3)


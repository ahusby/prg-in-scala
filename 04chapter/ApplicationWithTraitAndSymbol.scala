object ApplicationWithTraitAndSymbol extends App {
  val mySym = 'banan
  println("mySym.name=" + mySym.name)
  println("mySym.toString()=" + mySym.toString())
  assert (mySym.toString().equals("'" + mySym.name))
}
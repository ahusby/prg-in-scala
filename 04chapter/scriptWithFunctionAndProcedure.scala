println("Start")
val obj = new ClassWithFunctionAndProcedure
println(obj.myCommand())
println(obj.myFunction)


class ClassWithFunctionAndProcedure {
  private var myVar: String = "init"
  private val myVal = 666;

  def myCommand() {
    myVar += "-myCommand"
    myVar // Useless
  }

  def myFunction: String = {
    myVar + "-myFunction" }
}
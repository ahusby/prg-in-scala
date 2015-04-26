class Cat {
  private val sound = "mjau";

  def emitSound(times: Int ): String = {
      sound * times
  }
}


object Cat {
  private val cat = new Cat

  def emit1 = cat.sound * 1
  def emit3 = cat.emitSound(3)
}
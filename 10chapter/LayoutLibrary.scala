import Element.elem

abstract class Element {

  def contents: Array[String]

  val width = contents(0).length
  val height = contents.length

  override def toString =
    contents.map("|" + _ + "|").mkString("\n")

  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    elem(this1.contents ++ that1.contents)
  }

  def beside(that: Element): Element = {
    val this1 = this heighten that.height
    val that1 = that heighten this.height
    elem(
      for (
        (line1, line2) <- this1.contents zip that1.contents
      ) yield line1 + line2
    )
  }

  def widen(w: Int): Element =
    if (w <= this.width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right
    }

  def heighten(h: Int) =
    if (h <= this.height) this
    else {
      val top = elem(' ', width, (h - this.height) / 2)
      val bottom = elem(' ', width, h - this.height - top.height)
      top above this above bottom
    }
}


object Element {
  def elem(line: String): Element =
    new LineElement(line)

  def elem(c: Char, width: Int, height: Int): Element =
    new UniformElement(c, width, height)

  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)

  private class ArrayElement(val conts: Array[String]) extends Element {
    val maxWidth = conts.maxBy(_.length).length

    def padded(lines: Array[String]): Array[String] =
      lines.map(s => s + " " * (maxWidth - s.length))

    def contents = padded(conts)

    assume(contents.length == 0 || !contents.exists(_.length > contents(0).length))
  }

  private class LineElement(line: String) extends Element {
    def contents = Array(line)
  }

  private class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
    def contents = Array.fill(height)(ch.toString * width)
  }


}

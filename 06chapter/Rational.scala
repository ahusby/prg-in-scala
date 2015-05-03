class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  override def toString = numer + "/" + denom

  def + (that: Rational): Rational = {
    val newNumer = (numer * that.denom) + (that.numer * denom)
    val newDenom = denom * that.denom
    new Rational(newNumer, newDenom)
  }
  def + (i: Int): Rational = this + new Rational(i)

  def - (that: Rational): Rational = {
    val newNumer = (numer * that.denom) - (that.numer * denom)
    val newDenom = denom * that.denom
    new Rational(newNumer, newDenom)
  }
  def - (i: Int): Rational = this - new Rational(i)

  def * (that: Rational): Rational = new Rational(numer * that.numer, denom * that.denom)
  def * (i: Int): Rational = this * new Rational(i)

  def / (that: Rational): Rational = new Rational(numer * that.denom, denom * that.numer)
  def / (i: Int): Rational = this / new Rational(i)

  def lessThan(that: Rational): Boolean = numer * that.denom < that.numer * denom

  def max(that: Rational): Rational = if (lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
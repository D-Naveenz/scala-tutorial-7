package DataStructures

class RationalNumber(x: Int, y: Int) {
  def numerator: Int = x
  def denominator: Int = y

  def neg(): RationalNumber =
    new RationalNumber(-1 * numerator, denominator)

  def sub(r: RationalNumber): RationalNumber =
    new RationalNumber(numerator * r.denominator - r.numerator * denominator, denominator * denominator)

  override def toString: String = numerator + " / " + denominator
}

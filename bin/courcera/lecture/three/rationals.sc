package courcera.lecture.three

object rationals {

  val x = new Rational(1, 3)                      //> x  : courcera.lecture.three.Rational = 1/3
  val y = new Rational(5, 7)                      //> y  : courcera.lecture.three.Rational = 5/7
  val z = new Rational(3, 2)                      //> z  : courcera.lecture.three.Rational = 3/2

  val b = new Rational(2)                         //> b  : courcera.lecture.three.Rational = 2/1
  val a = new Rational(3, 0)                      //> java.lang.IllegalArgumentException: requirement failed: denominator must be 
                                                  //| non zero
                                                  //| 	at scala.Predef$.require(Predef.scala:233)
                                                  //| 	at courcera.lecture.three.Rational.<init>(courcera.lecture.three.rationa
                                                  //| ls.scala:14)
                                                  //| 	at courcera.lecture.three.rationals$$anonfun$main$1.apply$mcV$sp(courcer
                                                  //| a.lecture.three.rationals.scala:10)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at courcera.lecture.three.rationals$.main(courcera.lecture.three.rationa
                                                  //| ls.scala:3)
                                                  //| 	at courcera.lecture.three.rationals.main(courcera.lecture.three.rational
                                                  //| s.scala)
}

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be non zero")
  def this(x: Int) = this(x, 1)
  def numer = x
  def denom = y

  def add(that: Rational) =
    new Rational(this.numer * that.denom + this.denom * that.numer, this.denom * that.denom)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  def mul(that: Rational) = new Rational(this.numer * that.numer, this.denom * that.denom)

  override def toString = numer + "/" + denom
}
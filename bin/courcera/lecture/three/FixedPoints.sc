package courcera.lecture.three
import math.abs
object FixedPoints {
  println("Welcome to the Scala worksheetFinding fixed points")
                                                  //> Welcome to the Scala worksheetFinding fixed points

  val tolerance = 0.0001                          //> tolerance  : Double = 1.0E-4
  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) / x < tolerance              //> isCloseEnough: (x: Double, y: Double)Boolean

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      println(guess)
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double

  fixedPoint(x => 1 + x / x + x)(1)               //> 1.0
                                                  //| 3.0
                                                  //| 5.0
                                                  //| 7.0
                                                  //| 9.0
                                                  //| 11.0
                                                  //| 13.0
                                                  //| 15.0
                                                  //| 17.0
                                                  //| 19.0
                                                  //| 21.0
                                                  //| 23.0
                                                  //| 25.0
                                                  //| 27.0
                                                  //| 29.0
                                                  //| 31.0
                                                  //| 33.0
                                                  //| 35.0
                                                  //| 37.0
                                                  //| 39.0
                                                  //| 41.0
                                                  //| 43.0
                                                  //| 45.0
                                                  //| 47.0
                                                  //| 49.0
                                                  //| 51.0
                                                  //| 53.0
                                                  //| 55.0
                                                  //| 57.0
                                                  //| 59.0
                                                  //| 61.0
                                                  //| 63.0
                                                  //| 65.0
                                                  //| 67.0
                                                  //| 69.0
                                                  //| 71.0
                                                  //| 73.0
                                                  //| 75.0
                                                  //| 77.0
                                                  //| 79.0
                                                  //| 81.0
                                                  //| 83.0
                                                  //| 85.0
                                                  //| 87.0
                                                  //| 89.0
                                                  //| 91.0
                                                  //| 93.0
                                                  //| 95.0
                                                  //| 97.0
                                                  //| 99.0
                                                  //| 101.0
                                                  //| 103.0
                                                  //| 105.0
                                                  //| 107.0
                                                  //| 109.0
                                                  //| 111.0
                                                  //| 113.0
                                                  //| 115.0
                                                  //| 117.0
                                                  //| 119.0
                                                  //| 121.0
                                                  //| 123.0
                                                  //| 125.0
                                                  //| 127.0
                                                  //| 129.0
                                                  //| 131.0
                                                  //| 133.0
                                                  //| 135.0
                                                  //| 137.0
                                                  //| 139.0
                                                  //| 141.0
                                                  //| 143.0
                                                  //| res0: Double = 145.0

  // def sqrt(x: Double) = fixedPoint(y => x / y)(1.0)
  // def sqrt(x: Double) = fixedPoint(y => (y + x / y) / 2)(1.0)
  def avgDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
                                                  //> avgDamp: (f: Double => Double)(x: Double)Double
  def sqrt(x: Double) = fixedPoint(avgDamp(y => x / y))(1)
                                                  //> sqrt: (x: Double)Double
  sqrt(2)                                         //> 1.0
                                                  //| 1.5
                                                  //| 1.4166666666666665
                                                  //| 1.4142156862745097
                                                  //| res1: Double = 1.4142135623746899
  avgDamp(x => x / 2)(2)                          //> res2: Double = 1.5
}
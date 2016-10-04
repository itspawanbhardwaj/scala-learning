package informit.data.control.flow

object PatternMatchingExample {

  def monthName(n: Int): String =
    if (n == 1) "Jan"
    else if (n == 2) "Feb"
    else "Unknown"

  def patternMonthName(n: Int) = {
    n match {
      case 1 => "Jan"
      case 2 => "Feb"
      case _ => "Unknown"
    }
  }

  def daysInMonth(n: Int) = {
    n match {
      case 1 | 5 | 7 | 8 | 10 | 12 => 31
      case 4 | 6 | 9 | 11 => 30
      case 2 => 28
    }
  }

  def whatItIs(somthing: Any) = {
    somthing match {
      case 1 => "number"
      case "hello" => "String"
      case List(a, b, c) => "List"
      case n: Int => "the num is " + n
      case s: String => "the string is " + s
      case _ => "somthing else"
    }
  }
  def main(args: Array[String]) {
    // println(monthName(2));

    val n: Int = 13
    println(patternMonthName(n));

    println(whatItIs("hello"))

    println(whatItIs(List(2, 4, 5)))
  }
}
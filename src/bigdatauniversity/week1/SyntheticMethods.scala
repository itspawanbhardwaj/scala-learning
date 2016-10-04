package bigdatauniversity.week1

object SyntheticMethods {
  case class Time(hour: Int = 0, minutes: Int = 0)
  class TimeClass(hour: Int = 0, minutes: Int = 0)
  def main(args: Array[String]) {

    println("1. equals(): compare whether two different inctance of a class have same state")
    var time1 = new Time(hour = 10, minutes = 45)
    println(time1 == new Time(hour = 10, minutes = 45))

    println(time1 == new Time(hour = 10, minutes = 50))

    println("2. hashcode(): generates hashcode, used to avoide collision so that when you place values into hash based collection , they can be retrived quickly")
    println(time1.hashCode())

    println("3. toString(): print virtual memory location of instance, for case classes shows you the value inside of the class")

    println("class: " + new TimeClass(2, 3))
    println("case class: " + Time(2, 3))

    println("4. copy(): takes snapshot of case class when state needs to change, maintains immutability ")

    time1 = time1.copy(minutes = 4)

  }
}
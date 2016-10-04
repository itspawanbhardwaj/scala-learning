package bigdatauniversity.week1

object NamedArguements {
  def main(args: Array[String]) {
    println("default arguements");
    println(name("methew"));

    println("named arguements");
    println(name(first = "methew", middle = "charlie"));
  }

  def name(first: String = "", last: String = "pitt", middle: String = ""): String = {
    first + " " + middle + " " + last
  }
}
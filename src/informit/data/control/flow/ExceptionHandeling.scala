package informit.data.control.flow

object ExceptionHandeling {

  def parseInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: NumberFormatException => None
    }
  }
  
  def main(args:Array[String]){
    println(parseInt("3"));
     println(parseInt("pawan"));
  }
}
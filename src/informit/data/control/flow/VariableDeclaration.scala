package informit.data.control.flow

object VariableDeclaration {
  def main(args: Array[String]) {

    var x: Int = 1 + 1
    // var makes a mutable variable

    if (true) x = x + 1 else x = x - 1
    x = if (true) x + 1 else x - 1

    val z: Int = 1 + 1
    // val makes an immutable variable
   val variable =  if (true) "string" else 1
   // returns Any
   
     val variable2 =  if (true) 1.0 else 1
     // Double
     
     
     val variable3 =  if (true) "" else List() 
     //Object
  }
}
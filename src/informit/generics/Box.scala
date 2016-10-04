package informit.generics

object testMain {

  class Dog {
    override def toString(): String = "Its a dog"
  }
  class Puppy extends Dog {
    override def toString(): String = "Its a puppy"
  }
  case class Box[A](private var contents: A)
  object Box {
    def put[A](contents: A, box: Box[A]): Unit = box.contents = contents
    def get[A](box: Box[A]): A = box.contents
    def putPuppy[A >: Puppy](box: Box[A]): Unit = box.contents = new Puppy
    def getDog[A <: Dog](box: Box[A]): A = box.contents

    val puppyBox = new Box(new Puppy)
    val dogBox = new Box(new Dog)
  }
  def main(args: Array[String]) {

    val intBox = new Box(1)

    val content = Box.put(4, intBox)

    // intBox.contents = "Test" FAILS

    import Box._
    putPuppy(puppyBox)
    getDog(dogBox)

    getDog(puppyBox)
    putPuppy(dogBox)

  }
}

package example
import scala.collection.mutable
object main extends App {
  // make array like java
  val numbers = new Array[String](3)
  numbers(0) = "hello"
  numbers(1) = ","
  numbers(2) = "world"
  // simple style make array
  val numbers2 = Array("hello", ",", "world")
  println(numbers.toList)
  println(numbers2.toList)
  val oneTwo = List(1, 2)
  val threeFour = List(3, 4)
  // concatenation
  val oneToFour = oneTwo ::: threeFour
  println(oneToFour)
  // cons => ::
  val oneOneThree = 1 :: oneTwo
  val oneTwoThree = 1 :: 2 :: 3 :: Nil
  println(oneOneThree)
  // tuple
  val pair = (2, "tuple")
  println("pair => " + pair)
  println("first of pair => " + pair._1)
  println("second of pair => " + pair._2)
  // immutable set
  var immutableSet = Set("hello", "world")
  immutableSet += "!"
  println("immutable set => " + immutableSet)
  // mutable set
  val mutableSet = mutable.Set("hello", "world")
  mutableSet += "!"
  println("mutable set => " + mutableSet)
}

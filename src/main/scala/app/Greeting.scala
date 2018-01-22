package app

object Greeting extends App {
  def greet(name: String) = println(s"hello $name")
val name: String = "Jack"
  println("hello" + name)
  greet("Jack")
}
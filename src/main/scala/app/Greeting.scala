package app

import scala.io.StdIn

object Greeting extends App {
  def greet(name: String) = println(s"hello $name")
val name: String = StdIn.readLine("What is your name?")
  greet(name)
}
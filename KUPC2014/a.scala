import math._
object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val a = List.fill(3)(sc.nextInt)
    val b = List.fill(3)(sc.nextInt)
    var s = Array.fill(12)(0)
    s(0) = abs(a(0) - b(0)) + abs(a(1) - b(1)) + abs(a(2) - b(2))
    s(1) = abs(a(0) - b(1)) + abs(a(1) - b(2)) + abs(a(2) - b(0))
    s(2) = abs(a(0) - b(2)) + abs(a(1) - b(0)) + abs(a(2) - b(1))
    s(3) = abs(a(1) - b(0)) + abs(a(0) - b(1)) + abs(a(2) - b(2))
    s(4) = abs(a(1) - b(1)) + abs(a(0) - b(2)) + abs(a(2) - b(0))
    s(5) = abs(a(1) - b(2)) + abs(a(0) - b(0)) + abs(a(2) - b(1))
    println(s.min)
  }
}

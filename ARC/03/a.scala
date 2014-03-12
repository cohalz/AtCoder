object Main {
  def main(args:Array[String]) = {
    val n = readDouble
    val str = readLine
    val a = str.filter(_ == 'A').length
    val b = str.filter(_ == 'B').length
    val c = str.filter(_ == 'C').length
    val d = str.filter(_ == 'D').length
    val f = str.filter(_ == 'F').length
    println((4*a+3*b+2*c+d)/n)
  }
}

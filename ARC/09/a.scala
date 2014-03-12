object Main {
  def main(args:Array[String]) = {
    val n = readInt
    var a = new Array[Int](n)
    var b = new Array[Int](n)
    var sum = 0
    for(i <- 0 until n){
      var tmp = readLine.split(" ").map(_.toInt)
      sum += tmp(0)*tmp(1)
    }
    println((sum*1.05).toInt)
  }
}

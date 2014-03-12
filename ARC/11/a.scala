object Main {
  def main(args:Array[String]) = {
    val in = readLine.split(" ").map(_.toInt)
    val m = in(0)
    val n = in(1)
    var a = in(2)
    var sum = a
    while(a >= m){
      sum += n
      a -= m
      a += n
      // println(sum)
    }
    println(sum)
  }
}

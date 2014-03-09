object Main {
  def main(arg:Array[String]) = {
    val n = readInt
    var a = Array.ofDim[Int](n, 2)
    var tmp = ""
    var x = 0
    var y = 0
    var diff = 0.0
    var diffmax = 0.0
    for(i <- 0 until n){
      tmp = readLine
      a(i)(0) = tmp.split(" ")(0).toInt
      a(i)(1) = tmp.split(" ")(1).toInt
    }
    for(i <- 0 until n-1){
      for(j <- i+1 until n){
        x = a(i)(0)-a(j)(0)
        y = a(i)(1)-a(j)(1)
        diff = Math.sqrt(x*x + y*y)
        if(diff > diffmax) diffmax = diff
      }
    }
    println(diffmax)
  }
}


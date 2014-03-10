object Main {
  def main(arg:Array[String]) = {
    val n = readInt
    var count = 0
    val array = Array.ofDim[Long](n, 2)
    var a1 = 0L
    var a2 = 0L
    var a3 = 0L
    var d = 0L
    for(i <- 0 until n){
      var a = readLine.split(" ")
      array(i)(0) = a(0).toLong
      array(i)(1) = a(1).toLong
    }
    for(i <- 0 until n-2){
      for(j <- i+1 until n-1){
        for(k <- j+1 until n){
          a1 = array(i)(0)*(array(j)(1)-array(k)(1))
          a2 = array(j)(0)*(array(k)(1)-array(i)(1))
          a3 = array(k)(0)*(array(i)(1)-array(j)(1))
          d = (a1+a2+a3).abs
          if(d % 2 == 0 && d != 0) count += 1
        }
      }
    }
    println(count)
  }
}
// Main.main(null)

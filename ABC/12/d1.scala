object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n,m = sc.nextInt
    var arr = Array.fill(n,n)(99999999)
    var dist = Array.fill(n,n)(99999999)
    var mina = 0
    for (a <- 0 until m) {
      var i,j = sc.nextInt
      var dis = sc.nextInt
      arr(i-1)(j-1) = dis
      arr(j-1)(i-1) = dis
    }
    for (i <- 0 until n) {
      arr(i)(i) = 0
    }
    for (k <- 0 until n) {
      for (i <- 0 until n) {
        for (j <- 0 until n) {
          arr(i)(j) = arr(i)(j) min (arr(i)(k) + arr(k)(j))
        }
      }
    }
    println(arr.deep)
}
}

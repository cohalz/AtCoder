object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n,m = sc.nextInt
    var arr = Array.fill(n,n)(1000)
    var min = 1000
    var mini = 0
    var minj = 0
    var sum = 0
    for (a <- 0 until m) {
      var i,j = sc.nextInt
      var dis = sc.nextInt
      arr(i-1)(j-1) = dis
      arr(j-1)(i-1) = arr(i-1)(j-1)
      if(dis < min) {
        min = dis
        mini = i min j
        minj = i max j
      }
    }
    for (i <- 0 until n; j <- 1 to n) {
      %n
    }
  }
}

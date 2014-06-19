object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val k = sc.nextInt
    val m = sc.nextInt
    val a = Array.fill(k)(sc.nextInt)
    val c = Array.fill(k)(sc.nextInt)
    val ans = Array.fill(m)(a(k-1) & c(0))
    for (i <- k until m) {
      for (j <- 0 until k-1) {
        ans(i) = ans(i) ^ (a(k-1-j) & c(j))
      }
    }
    println(ans(m-1))
  }
}

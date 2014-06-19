object Main {
  def main(args:Array[String]):Unit = {
    val sc = new java.util.Scanner(System.in)
    val r,c,d = sc.nextInt
    val arr = Array.fill(r,c)(sc.nextInt)
    val a = for {
      i <- (d%2) to ((r-1) min d) by 2
      j <- (d%2) to ((c-1) min d) by 2
      if i+j <= d
    } yield arr(i)(j)
    println(a.max)
  }
}

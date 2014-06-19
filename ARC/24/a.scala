object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n,m = sc.nextInt
    val a = Array.fill(n)(sc.nextInt)
    val b = Array.fill(m)(sc.nextInt)
    var count = 0
    for (i <- 0 until a.length; j <- 0 until b.length) {
      if(a(i) == b(j)) {
        count += 1
        a(i) = -1
        b(j) = -2
      }
    }
    println(count)
  }
}

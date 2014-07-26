object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val sum = 2025
    val m = sum - n
    val a = for (i <- 1 to 9; j <- 1 to 9) yield (i,j)
    for ((i,j) <- a) {
      if(i * j == m) println(i + " x " + j)
    }
  }
}

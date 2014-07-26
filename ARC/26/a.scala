object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n,a,b = sc.nextInt
    val m = n min 5
    println(a*(n-m) + m*b)
  }
}

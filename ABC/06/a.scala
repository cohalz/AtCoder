object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    if(n % 3 == 0) println("YES")
    else println("NO")
  }
}

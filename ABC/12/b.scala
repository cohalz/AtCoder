object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val a = n / 3600
    val b = (n / 60) % 60
    val c = n % 60
    if()
    if(a <= 9) print(0)
    print(a+":")
    if(b <= 9) print(0)
    print(b+":")
    if(c <= 9) print(0)
    println(c+"")
  }
}

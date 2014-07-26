object Main {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  def main(args:Array[String]) = {
    per(n)
  }
  def per(n: Int): Unit = {
    var sum = 0
    for (i <- 1 until n) {
      if(n%i == 0) sum += i
      if(sum > n) {
        println(sum + "Abundant")
        return
      }
    }
    if(n == sum) println(sum + "Perfect")
    else println(sum + "Deficient")
  }
}

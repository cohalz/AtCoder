object Main {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextLong
  def main(args:Array[String]) = {
    per(n)
  }
  def per(n: Long): Int = {
    var sum = 0L
    for (i <- 1L until (n/2)) {
      if(n%i == 0) sum += i
      if(sum > n) {
        println("Abundant")
        return 1
      }
    }
    if(n % 2 == 0) sum += n/2
    if(sum > n) println("Abundant")
    else if(n == sum) println("Perfect")
    else println("Deficient")
    return 0
  }
}

object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val l = Array.fill(n)(sc.nextInt)
    var sum = 0
    var tmp = 0
    for (a <- l) {
      tmp = a
      while(tmp % 2 == 0 || tmp % 3 == 2) {
        tmp -= 1
        sum += 1
      }
    }
    println(sum)
  }
}

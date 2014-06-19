object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val lst = List.fill(n)(sc.nextInt)
    val ans = lst.distinct.sorted.init.last
    println(ans)
  }
}

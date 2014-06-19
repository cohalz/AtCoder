object Main {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val l = Array.fill(n)(sc.nextInt)
    // val list = new Array[List[Int]](pow(n))


  def main(args:Array[String]) = {
    var sum = 0
    for(i <- 0 until l.length) {
      sum += dfs(0,List(i),l(i))
    }
    println(sum/l.length.toDouble)
  }
  def pow(n: Int): Int = {
    if(n == 1) return 1
    n * pow(n-1)
  }
  def dfs(n: Int ,c: List[Int],sum: Int,f: Array[Int]): Int = {
    if(n == l.length) return sum
    for(i <- 0 until l.length if !arr.contains(i)) {
      if(i != l.length-1 && l(i+1)%l(i) == 0){

      }
      dfs(n+1,)
    }
  }
}


object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val zz = sc.nextLine
    val l = List.fill(n)(sc.nextLine).sorted
    val a = l.distinct
    var max = 1
    var tmp = 1
    var j = 0
    for (i <- 0 until l.length-1) {
      if(l(i) == l(i+1)) tmp += 1
      else tmp = 1
      if(max < tmp) {
       max = tmp
       j = i
      }
    }
    println(l(j))
  }
}

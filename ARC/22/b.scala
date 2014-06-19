object Main {
  val sc = new java.util.Scanner(System.in)
  val n = sc.nextInt
  val a = List.fill(n)(sc.nextInt)
  var b:Set[Int] = a.toSet
  def main(args:Array[String]) = {
    println(m(a))
  }
  def m(a:List[Int]): Int = {
    for(i <- n-1 to 1 by -1) {   
      for(j <- 0 to n-2 if i+j < n) {
        b = a.slice(j,j+i).toSet
        // println(j,i+j)
        if(b.size == a.slice(j,j+i).length) {
          return b.size
        }
      }
    }
    return 1
  }
}

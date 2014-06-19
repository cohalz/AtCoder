object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val txa = sc.nextInt
    val tya = sc.nextInt
    val txb = sc.nextInt
    val tyb = sc.nextInt
    val t = sc.nextInt
    val v = sc.nextInt
    val n = sc.nextInt
    val s = Array.fill(n,2)(sc.nextInt)
    val max = t * v
    var flag = 0
    var d1 = 0.0
    var d2 = 0.0
    for (i <- s) {
      d1 = dis(txa,tya,i(0),i(1))
      d2 = dis(i(0),i(1),txb,tyb)
      if(max >= d1 + d2) flag = 1
    }
    if(flag == 1) println("YES")
    else println("NO")
  }
  def dis(x1:Int, y1:Int, x2:Int, y2:Int) : Double = {
    Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2))
  }
}

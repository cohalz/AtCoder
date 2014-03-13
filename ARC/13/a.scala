object Main {
  def main(args:Array[String]) = {
    val in1 = readLine.split(" ").map(_.toInt)
    val in2 = readLine.split(" ").map(_.toInt)
    var n = in1(0)
    var m = in1(1)
    var l = in1(2)
    var p = in2(0)
    var q = in2(1)
    var r = in2(2)
    var tmp1 = for(i <- 1 to n if i%p == 0) yield i
    var tmp2 = for(i <- 1 to m if i%q == 0) yield i
    var tmp3 = for(i <- 1 to l if i%r == 0) yield i
    val count1 = tmp1.length * tmp2.length * tmp3.length
    var tmp4 = for(i <- 1 to n if i%q == 0) yield i
    var tmp5 = for(i <- 1 to m if i%p == 0) yield i
    val count2 = tmp4.length * tmp5.length * tmp3.length
    if(tmp3 contains l) println(count1 max count2)
    else if(!(tmp1.contains(n)) && !(tmp2.contains(m)) && tmp4.contains(n) && tmp5.contains(m)) println(count2)
    else if(!(tmp4.contains(n)) && !(tmp5.contains(m)) && tmp1.contains(n) && tmp2.contains(m)) println(count1)
    else println(0)
  }
}

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
    var tmp4 = for(i <- 1 to n if i%q == 0) yield i
    var tmp5 = for(i <- 1 to m if i%r == 0) yield i
    var tmp6 = for(i <- 1 to l if i%p == 0) yield i
    var tmp7 = for(i <- 1 to n if i%r == 0) yield i
    var tmp8 = for(i <- 1 to m if i%p == 0) yield i
    var tmp9 = for(i <- 1 to l if i%q == 0) yield i
    var c1 = tmp1.length * tmp2.length * tmp3.length
    var c2 = tmp1.length * tmp5.length * tmp9.length
    var c3 = tmp4.length * tmp5.length * tmp6.length
    var c4 = tmp4.length * tmp8.length * tmp3.length
    var c5 = tmp7.length * tmp8.length * tmp9.length
    var c6 = tmp7.length * tmp2.length * tmp6.length
    println(c1 max c2 max c3 max c4 max c5 max c6)
  }
}

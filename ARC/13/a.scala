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
    var tmp1 = (1 to n).filter(_%p == 0).length
    var tmp2 = (1 to m).filter(_%q == 0).length
    var tmp3 = (1 to l).filter(_%r == 0).length
    var tmp4 = (1 to n).filter(_%q == 0).length
    var tmp5 = (1 to m).filter(_%r == 0).length
    var tmp6 = (1 to l).filter(_%p == 0).length
    var tmp7 = (1 to n).filter(_%r == 0).length
    var tmp8 = (1 to m).filter(_%p == 0).length
    var tmp9 = (1 to l).filter(_%q == 0).length
    var c1 = tmp1 * tmp2 * tmp3
    var c2 = tmp1 * tmp5 * tmp9
    var c3 = tmp4 * tmp5 * tmp6
    var c4 = tmp4 * tmp8 * tmp3
    var c5 = tmp7 * tmp8 * tmp9
    var c6 = tmp7 * tmp2 * tmp6
    println(c1 max c2 max c3 max c4 max c5 max c6)
  }
}

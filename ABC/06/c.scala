object Main {
  val sc = new java.util.Scanner(System.in)
  var n = sc.nextInt
  var m = sc.nextInt
  val dp = Array.ofDim[(Int,Int,Int,Boolean)](n,m)
  def main(args:Array[String]) = {
    var b = 0
    var i = 0
    if(m %2 == 1) {
      n -= 1
      m -= 3
      b += 1
    }
    var t = 2*(n/2)+4*(n-n/2)
    println(t)
  }
}

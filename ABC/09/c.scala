object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val k = sc.nextInt
    val s = readLine
    var ans = new Array[Char](n)
    var sh = s.sorted
    for (i <- 0 until n) {
      ans(i) = s(i)
    }
    var tmp = ans
    var t = 'a'
    var count = 0
    while(counts(ans,tmp) <= k){
      for (i <- 0 until n) {
        for (j <- i+1 until n) {
          if(sh(i) == ans(j) && count < k) {
            t = ans(j)
            ans(j) = ans(i)
            ans(i) = t
          }
        }
      }
    }
    ans.foreach(print)
    println("")
    }
    def counts(str1: Array[Char], str2: Array[Char]) : Int = {
      var count = 0
      for (i <- 0 until str1.length) {
        if(str1(i) != str2(i)) count += 1
      }
      count
    }
  }

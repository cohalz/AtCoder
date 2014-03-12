// WA...
//I can't write AC code.
object Main {
  def main(args:Array[String]) = {
    val in = readLine.split("/").map(_.toInt)
    var y = in(0)
    var m = in(1)
    var d = in(2)
    val day30 = List(2,4,6,9,11)
    var tmp:Option[Int] = None
    val uflag = {
      if(y%400 == 0) true
      else if(y%100 == 0) false
      else if(y%4 == 0) true
      else false
    }
    var flag = true
    var ms = ""
    var ds = ""
    while(flag){
      if(m >= 13){
        y += 1
        m = 1
        d = 1
      }
      else if(y%m != 0) {
        m += 1
      } else {
        tmp = (d to 31).find((y/m)%_ == 0)
        tmp match {
          case Some(n) =>
            if(n == 31 && day30.contains(m)){
              m += 1
              d = 1
            }else if((n > 29 && m == 2)||(n > 28 && m == 2 && !uflag)){
              m += 1
              d = 1
            }else{
              flag = false
              d = n
            }
          case None =>
            m += 1
            d = 1
        }
      }
    }
    if(m < 10) ms = "0"
    if(d < 10) ds = "0"
    println(y+"/"+ms+m+"/"+ds+d)
  }
}

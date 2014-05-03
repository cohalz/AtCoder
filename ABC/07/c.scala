object Main {
    val in = readLine.split(" ").map(_.toInt)
    val r = in(0)
    val c= in(1)
    val dp = Array.ofDim[Int](r,c)
    
    val in1 = readLine.split(" ").map(_.toInt)
    val in2 = readLine.split(" ").map(_.toInt)
    var sy = in1(0)
    var sx = in1(1)
    val gy = in2(0)
    val gx = in2(1)

  def main(args:Array[String]) = {
    var arr = new Array[String](r)
    for(i <- 0 until r){
      arr(i) = readLine
    }
    f(sy,sx,0,0)
  }
  def f(x :Int , y : Int, xf:Int , yf:Int) = {
    if(dp(y)(x) == 0) dp(y)(x) = dp(y+yf)(x+xf) + 1
    else if(dp(y)(x) > dp(y+yf)(x+xf) + 1){
      dp(y)(x) = dp(y+yf)(x+xf) + 1
    }else {
      if(x > 0) f(x-1,y,1,0)
      if(x < c-1) f(x+1,y,-1,0)
      if(y > 0) f(x,y-1,0,1)
      if(y < r-1) f(x,y+1,0,-1)
    }
  }
}

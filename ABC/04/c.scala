object Main {
    def main(arg:Array[String]) = {
        val N = readInt
        var arr = Array(1,2,3,4,5,6)
        var tmp:Int = 0
        for(i <- 0 until N%30){
          tmp = arr(i%5)
          arr(i%5) = arr((i%5)+1)
          arr((i%5)+1) = tmp
        }
        arr.foreach(print _)
        println("")
    }
}

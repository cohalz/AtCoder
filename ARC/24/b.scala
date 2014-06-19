import scala.collection.mutable.ArrayBuffer
object Main {
  def main(args:Array[String]) = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt
    val l = List.fill(n)(sc.nextInt)
    var a = l.toArray
    var b = l.toArray
    var ind = new ArrayBuffer[Int]
    var count = 0
    var flag = 0
    var time = 0
    do {
      flag = 0
      for (i <- ind) {
        a(i) = b(i)
      }
      for (i <- 0 until l.length) {
        if(a((n+i)%n) == a((n+i-1)%n) && a((n+i)%n) == a((n+i+1)%n)) {
          b(i) = (a(i)+1)%2
          ind += i
          flag = 1
        }
      }
      count += 1
      time += 1
    } while(flag == 1 || time < 100)
    if(time >= 100) println(-1)
    else println(count)
  }
}

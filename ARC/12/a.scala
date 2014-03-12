object Main {
  def main(args:Array[String]) = {
    val lst = List( "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" )
    val day = readLine
    if(day == "Sunday" || day == "Saturday") println(0)
    else{
      println(6-lst.indexWhere(_==day))
    }
  }
}

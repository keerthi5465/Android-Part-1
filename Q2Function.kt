//convert cel to far  and far to cel(Temp) -
fun main() {
    celtofar(32)
    fartocel(0)
 }
fun celtofar(currenttemp:Int){
    val c=(currenttemp-32)*5/9
    println("So the current temp in cel is " + c)
}
fun fartocel(currenttemp : Int){
    val f = (currenttemp*9/5)+32
    println("So the current temp in far " + f)
}
//Method 2
fun main() {
    val result = celtofar(32)
    println("So the current temp in cel " + result )
    fartocel(0)
 }
fun celtofar(currenttemp:Int):Int{
    val c=(currenttemp-32)*5/9
    val result = return c
}
fun fartocel(currenttemp : Int){
    val f = (currenttemp*9/5)+32
    println("So the current temp in far " + f)
}

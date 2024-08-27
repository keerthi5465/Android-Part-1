fun main() {
    var a=10
    var b=67
     println("Sum of the "+a+" and "+b+" is "+(a+b))
     println("Sum of $a and $b is ${a+b}")
     var `if`=10
     println(`if`)
 }
// for accessing the value from one function to another
var a=10
fun main() {
    xyz()
    println(a)
}
fun xyz(){
    var a=60
    print(a)
}

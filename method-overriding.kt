open class rectange(var a:Double , var b:Double){
    fun area():Double{
        return a*b
    }
    open fun display(){
        println("So the area of Rectangle is :  ${this.area()}")
    }
    
}
class square(var s:Double):rectange(s,s){
    override fun display(){
        println("So the area of square is : ${this.area()}")
    }
    
}
fun main(){
    val r1=rectange(20.0,30.0)
    r1.display()
    val s1=square(4.0)
    s1.display()
}

var x = 10000
    var y= "Yes" 
    if(x>=1000){
        if(y==("Yes")){
            
            println("20% Discount is unlocked the total amount is "+x-(0.2*x))
        }
        else{
            println("10% Discount is unlocked the total amount is "+x-(0.1*x))

        }

    }else{
        println("Sorry! No Discount the total amount is "+x)
    }
// Another example
var a=10
    var rem=a%2
    var num=when(rem){
        0 -> println("Even")
        1 -> println("Odd")
        
         
        else -> println("Enter correct")
    }
//Example 2
class rectange(var a:Double , var b:Double){
    fun area():Double{
        return a*b
    }
    fun display(){
        println("So the area of Rectangle is :  ${this.area()}")
    }
    
}
fun main(){
    val r1=rectange(20.0,30.0)
    r1.display()
}


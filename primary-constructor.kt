class intro(var name:String,var age:Int){
    var name:String
    var age:Int
//     constructor( name:String, age:Int){
//         this.name=name
//         this.age=age
        
    
    constructor(name:String):this()//here this is used to as method {
        this.name=name
        this.age = 0
    }
    constructor():this("Ram",20)
       
    fun intros(){
        println("My name is ${name} and age is ${age}")
    }
}
fun main(){
    
    
    var intro2=intro("Ram",30)
    intro2.intros()
    var intro3=intro()
    intro3.intros()
    
}

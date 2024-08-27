class intro{
    var name:String
    var age:Int
    constructor( name:String, age:Int){
        this.name=name
        this.age=age
        
    }
    constructor( name:String){
        this.name=name
        this.age = 0
    }
    constructor(){
        this.name="Keerthi"
        this.age=23
    }
    fun intros(){
        println("My name is ${name} and age is ${age}")
    }
}
fun main(){
    var name=readln()
    var age=readln().toInt()
    var intro=intro()
    intro.intros()
    var intro2=intro(name,age)
    intro2.intros()
    var intro3=intro("Ravi")
    intro3.intros()
    
}

fun main() {
    val n = arrayOf(1, 2, 3, 4)
    n[2] = 30
    //println(n[2])
    var firstno = n[0]
    var words: Array<String> = arrayOf("Kotlin", "Java")
    words.forEach { word -> println(word)}
    val sq = Array(5) { i -> i * i }
    var secondno = words[1]
    for (i in sq){
        println(i)
    }
    var size=n.size
    println(size)
   }
// example 
for(i in 1..5){
    println(i)
}
for(i in 1 until 5){
    println(i)
}
val n=arrayOf("a","b","c","d","e",48448)
    for (i in n){
        println(i)
    }
    val n=arrayOf("Hello",48448,9.00)
    
    for (i in n.indices){
        println("Element at index $i  is ${n[i]}")
    }



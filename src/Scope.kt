var b = 100 //Global Variable

fun test ():Unit {
    println(b)
}

fun main (args:Array<String>){
    var a = 10 // Local Variable
    var sum = a + b
    println(sum)
}
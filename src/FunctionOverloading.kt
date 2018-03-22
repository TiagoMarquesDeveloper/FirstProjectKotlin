//Function Overloading
fun add(a:Int,b:Int): Int{
    return a + b
}

fun add(a:Int,b:Int,c: Int): Int{
    return a + b + c
}

fun add(a:Int,b:Int,c: Int,d:Int): Int{
    return a + b + c + d
}

fun main (args:Array<String>){
    var funa = add(12,20)
    println(funa)

    var funb = add(10,50,190)
    println(funb)
}
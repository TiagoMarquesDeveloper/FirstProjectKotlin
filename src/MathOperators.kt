fun main (args:Array<String>){
    //simple calculator
    println("Please enter the first number")
    var n1 : Int = readLine()!!.toInt()
    println("Please enter the second number")
    var n2 : Int = readLine()!!.toInt()

    var sum : Int
    var sum2 : Int
    var product : Int
    var div : Float

    sum = n1 + n2
    println("the sum is " + sum)

    sum2 = n1 - n2
    println("the difference is " + sum2)

    product = n1 * n2
    println("the product is " + product)

    div = n1.toFloat() / n2.toFloat()
    println("the answer is " + div)
}
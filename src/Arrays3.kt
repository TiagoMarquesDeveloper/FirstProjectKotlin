fun main (args:Array<String>){
    var number = Array<Int>(3){0}

    for (counter in 0..2){
        println("Enter number " + counter)
        number[counter] = readLine()!!.toInt()
    }
    print(number[1])
}
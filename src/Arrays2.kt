fun main (args:Array<String>){
    var number = Array<Int>(3){0}
    number[0] = 100
    number[1] = 20
    number[2] = 40

    for(counter in number){
        println("number " + counter)
    }
}
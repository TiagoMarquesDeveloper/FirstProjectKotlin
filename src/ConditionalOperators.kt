fun main (args:Array<String>){
   /** var a = 20
    if (a >= 10){
        println("A is greater or equal to 10")
    }
    println("Please enter a number")
    var n : Int = readLine()!!.toInt()
    if ( n >= 10){
        println("Your number is greater than 10")
    }

    print("Please enter your age: ")
    var age: Int = readLine()!!.toInt()

    if (age >= 21){
        println("You can drink alcohol")
    }else{
        println("You are not allowed to drink")
    }*/

    print("Please enter your grade: ")
    var grade : Double = readLine()!!.toDouble()

    if (grade < 0 || grade > 100) {
        print("Please enter valid marks")
    }else if (grade >= 90 && grade <= 95) {
        print("You got an A!")
    }else if (grade > 95){
        print("You got a perfect score")
    }else if (grade > 40){
        print("You got a good score")
    }else if (grade <= 40){
        print("you failed")
    }
}
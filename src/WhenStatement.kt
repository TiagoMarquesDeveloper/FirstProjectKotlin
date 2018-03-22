fun main (args:Array<String>){
    //Check the marks and give a grade
    println("Please enter your marks: ")
    var marks: Int = readLine()!!.toInt()
    when(marks){
        in 90..99 -> {print("You got a A")}
        100 -> {print("You got a Perfect Score")}
        in 0..40 -> {  print("You Failed!!!")}
        in 0..89 -> { print("Good Score!")}
    else -> { print("Invalid Mark!")}
    }
}
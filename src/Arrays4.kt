fun main (args:Array<String>){
    var names = ArrayList<String>()
    names.add("Tiago")//index would be 0
    names.add("João")//1
    names.add("Joaquim")//2
    names.add("Manuel")//3

    //println("Name: " + names.get(1))
    //print out all elements
    //for (counter in names){
   //     println(counter)
   // }

    //Searching the ArrayList
    if (names.contains("Joaquim")){
        println("Joaquim exists in our database")
    }else{
        println("This name is not registered into any account")
        println("Please create an account!")
    }

 }
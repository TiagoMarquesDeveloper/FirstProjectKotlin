class Apple (){

    var color:String? = null
    var shape:String? = null

    //Will be executed when class is initialized or instance is created
    //init {
        //println("Color: " + color)
        //println("Shape: " + shape)
   //     this.color = color
    //    this.shape = shape
   // }

    constructor(color:String,shape:String):this(){
            this.color = color
            this.shape = shape
    }

    fun GetColor():String?{
        return this.color
    }

    fun GetShape():String?{
        return this.shape
    }

}

fun main (args:Array<String>){
    var fruit = Apple("Red","Circular")
    println("Color: " + fruit.GetColor())
    println("Shape: " + fruit.GetShape())
    var Greenfruit = Apple("Green","Round")
    println("Color: " + Greenfruit.GetColor())
    println("Shape: " + Greenfruit.GetShape())
}
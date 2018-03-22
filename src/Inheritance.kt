open class Math(){
    open fun add(a:Int,b:Int): Int {
        return a + b
    }
    fun sub(a:Int,b:Int): Int{
        return a - b
    }
}

class Math2():Math(){
    var x : Int? = null

    override fun add(a:Int,b:Int): Int {
        this.x = 20
        println("Super Example " + super.sub(20,10))
        return a + b + 100
    }

    fun multiply(a:Int,b:Int):Int{
        return a * b
    }
    fun divide(a:Int,b:Int):Int{
        return a / b
    }
}

fun main(args:Array<String>){
    //var math = Math()
    //var add = math.add(20,10)
    //println(add)
    //var sub = math.sub(40,20)
    //println(sub)
    var math2 = Math2()
    var add = math2.add(20,60)
    var sub = math2.sub(100,20)
    var multiply = math2.multiply(3,2)
    var divide = math2.divide(10,2)
    println(add)
    println(sub)
    println(multiply)
    println(divide)
}
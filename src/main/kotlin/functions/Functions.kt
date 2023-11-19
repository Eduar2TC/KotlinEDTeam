package functions

fun main() {
    fun func1(){
        print("hello")
    }
    fun func2(param1: Int = 3, param2: Float, param3: String){
        print("values ${param1 + param2} param3 ")
    }
    fun func3(newValue: Int) : Int {
        val value:Int = newValue
        return value
    }

    fun sqrd1(n:Int): Int{
        return n * n
    }
    //Simplification
    fun sqrd2(n:Int) = n  * n

    //Generics
    fun fn(value: Int){}
    fun fn(value: String){}
    fun fn(value: Boolean){}
    /*
    .
    .
     */
    fun <T> operation(value:T){
        println("HELLO-----> $value")
    }

    fun String.log(){
        print("..... $this")
    }

    operation(10)
    operation("MIKEL")
    operation(10.50000775)

    var text = ""


}
package classes
//Data automatic create setters and getters
data class Data(var name:String, var age:Int, /*...*/ ) {
    var n:String = name
    var a:Int = age

        set(value) {
            field = value
        }
        get() {
            return field
        }

}

fun main(args: Array<String>) {
    var person = Data("Pepe", 20)
    println("${person.n} ${person.a}")
   person.n = "Toño"
    println("${person.n} ${person.a}")

}
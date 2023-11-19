package classes

class Figure {
    private var side: Int = 0
    private var name : String? = null

    constructor( side: Int, name: String ) {
        this.side = side
        this.name = name
    }

    fun printData(){
        print("$side $name ")
    }
}
//2nd clas form
class Figure2(side: Int, name: String){
    var side: Int?
    var name: String?
    var color: String? = null

    init {
        this.side = side
        this.name = name
    }
    constructor(color: String):this(10, "Triangle"){
        this.color = color
    }
}
fun main(args: Array<String>) {
    var figure = Figure(10, "Triangle")
    figure.printData()
}
package classes

open class Animal(group: String) {
    private var group: String? = null
    private var age : Int? = null
    init {
        this.group = ""
    }
    constructor(group: String, age: Int):this(group){
        this.group = group
        this.age = age
    }
}
class Dog: Animal {
    private var name: String? = null
    constructor(group: String, age: Int, name: String ):super(group, age){
        this.name = name
    }

}
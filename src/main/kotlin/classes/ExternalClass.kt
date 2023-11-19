package classes

class ExternalClass {
    var data: Int? = null
    var data2: String? = null

  /*  inner class innerClass{
        var innerData:Int? = null

        fun action(){}
    }*/
  class innerClass{
      var innerData:Int? = null

      fun action(){}
  }
}

fun main() {
    var obj = ExternalClass.innerClass();
    obj.action()
}
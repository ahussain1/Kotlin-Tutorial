fun main(args: Array<String>) {
    var name : String = "Zoro"
//    name = null

    var nullableName : String? = "Do I really exist?"
//    nullableName =
//    println(nullableName.length)

    var length = 0
    if(nullableName != null) {
        length  = nullableName.length
    } else {
        length = -1
    }

    println(length)

    val l = if (nullableName != null) nullableName.length else -1
    println(l)

    //Second method safe call operator ?
    println(nullableName?.length)

    // Elvis Operator
    val len = nullableName?.length ?: -1
    val noName = nullableName ?: "No one knows me..."

    println(noName)

    // !!

    println(nullableName)

}
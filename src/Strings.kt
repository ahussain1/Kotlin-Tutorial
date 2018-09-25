fun main(args: Array<String>) {
    val str = "May the force be with you."
    println(str)

    val str1 = "Chelsea is an English EPL team."
    var rawCrawl = """|Chelsea,
        |Tottenham,
        |Man City
    """.trimMargin()

    println(rawCrawl)

//    for (char in str1) {
//        println(char)
//    }

    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    val contains = str.contains("force", true)
    println(contains)

    val uppercase = str.toUpperCase()
    val lowercase = str.toLowerCase()

    println(lowercase)
    println(uppercase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)

    val captain = "Hazard"
    val team = "Chelsea"
    println("The captain of $team is $captain")
    println("The captains name has ${captain.length} characters")
}
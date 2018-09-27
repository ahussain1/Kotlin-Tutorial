fun main(args: Array<String>) {

    fun forceChoke() {
        println("You have failed me for the last time Admiral...")
    }

    forceChoke()

    fun makeAnEntrance(line: String) {
        println(String)
    }

    makeAnEntrance("I find your lack of faith disturbing.")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }

    val rebels = calculateNumberGoodGuys(5, 7)
    print("Darth Vader faced off against $rebels enemies")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(19, 45)} rebels.")

    fun vaderIsFeeling(mood: String = "angry") { //default value
        println(mood)
    }

    vaderIsFeeling()
    vaderIsFeeling("happy")
}
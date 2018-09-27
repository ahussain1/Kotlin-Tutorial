fun main(args: Array<String>) {
    val a = 2
    val b = 5

    if (a == b) {
        print("a is equal to be b")
    }

    if (a != b ) {
        println("A does not equal b")
    }

    val accountBalance = 100
    val price = 50

    if (accountBalance >= price) {
        println("You can buy this!")
    } else {
        println("Sorry, you don't have enough money")
    }

    val degrees = 55

    if (degrees >= 70) {
        println("This is some nice weather")
    } else if (degrees < 70 && degrees >= 50) {
        println("Grab a sweater")
    } else {
        println("Holy crap, it's cold!")
    }

    val isHungry = false
    val isBored = true

    if (isHungry || isBored) {
        println("Lets's get food!")
    }

    val x = 1
    when (x) {
         1 -> println("x == 1")
         2 -> println("x == 2")
        else -> println("x does not equal 1 or 2")
    }

    fun vaderIsFeeling(mood: String = "angry") {
        if (mood == "angry") {
            println("run for the hills, Vader is $mood")
        } else {
            print("Whatever you do, don't make him angry")
        }
    }

    vaderIsFeeling("happy")
}


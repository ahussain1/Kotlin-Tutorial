fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message)}

    printMessage("Hello World!")
    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(3, 5))

    val sumB: (Int, Int) -> Int = {x,y -> x+y}

    fun downloadData(url: String, completion: ()-> Unit) {
        //sent a download request
        //we got back data
        //there were no network errors
        completion()
    }

    //call downloadDataFunction
    downloadData("fakeUrl.com", { println("The code in this block, will only runafter the completion()")})

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        //send a download request
        //we got back car data
        var car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }

    downloadCarData("fakeUrl.com") {car ->
        println(car.model)
        println(car.make)
    }

//    downloadCarData("fakeUrl.com") {
//        println(it.model)
//        println(it.make)
//    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean) -> Unit) {
        //make the web request
        //we get the results back
        val webRequestSuccess = false

        if (webRequestSuccess) {
            //recieved truck data
            val truck = Truck("Ford", "F-150", 10000)
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com") { truck, success ->
        if (success == true) {
            //do something with the truck
            truck?.tow()
        } else {
            println("Soemthing went wrong!")
        }
    }
}
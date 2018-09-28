//class Car(make: String, var model: String, var color: String) { //get and setters within the
//    val make = make
//
//    fun accelerate() {
//        println("vroom vroom")
//    }
//
//    fun details() {
//        println("This is a $color $make $model")
//    }
//}
//
//class Plane(val make: String, val model: String) {
//
//}
//
//
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//    fun tow() {
//        println("Taking the horses to the rodeo")
//    }
//
//    fun details() {
//        print("The $make $model has a towing capacity of $towingCapacity pounds.")
//    }
//}

open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("Vroom vroom")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("Stop")
    }
}

class Car(make: String, model: String, color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous mode!")
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {

}


fun main(args: Array<String>) {

    val tesla = Car("Tesla", "ModelS", "Red")
    tesla.accelerate()
    val truck = Truck("Ford", "F-150", 10000)
    truck.brake()

//    val car = Car("Toyota", "Avalon", "Red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    val truck = Truck("Ford", "F-150", 10000)
//    truck.tow()
//    car.details()
//    truck.details()
}
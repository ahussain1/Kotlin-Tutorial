fun main(args: Array<String>) {
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.contains("John"))
    println(imperials.last())
    println(imperials)

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbaca")
    print(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    print(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)

    val rebelVehicleMap = mapOf("Solo" to "Millenium Falcon")
    println(rebelVehicleMap["Solo"])
    println(rebelVehicleMap.get("Solo"))
    println(rebelVehicleMap.getOrDefault("Leiah", "this ship doesnt exist"))
    println(rebelVehicleMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Bob Fetta" to "Mercedes")
    rebelVehicles["Luke"] = "BMW"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles.isEmpty())
}
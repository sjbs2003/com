package com.KOTLIN.Collections

fun main() {
//    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
//    println(solarSystem[2])
//    println(solarSystem.get(3))
//    println(solarSystem.indexOf("Mercury"))
//
//    for (planet in solarSystem)
//        println(planet)

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")
    solarSystem.add(3,"Shri")

    solarSystem[0] = "Vicki"
    solarSystem[1] = "Suraj"

    for (l in solarSystem)
        print(l)
    println()
    solarSystem.removeAt(9)
    solarSystem.remove("Vicki")

    for (l in solarSystem)
        print(l)
    println()

    println(solarSystem.contains("Shri"))
    println(solarSystem.contains("Vicki"))

    println("Moon" in solarSystem)

}
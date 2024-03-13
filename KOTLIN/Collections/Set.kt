package com.KOTLIN.Collections

import kotlin.math.sin

fun main(){
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem.size)
    solarSystem.add("Shri")
    println(solarSystem.size)
    println(solarSystem.contains("Suraj"))
    println("pluto" in solarSystem)
}

package com.KOTLIN.inheritence

import kotlin.math.sqrt

class Triangle(
    val a:Double,
    val b:Double,
    val c:Double
): Shapes("Triangle") {
    init {
        println("Area and Perimeter of $name is:${area()} and ${perimeter()}")
    }

    override fun area() = sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter()/2 - c))

    override fun perimeter() = a+b+c

}
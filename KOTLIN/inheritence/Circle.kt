package com.KOTLIN.inheritence

import kotlin.random.Random

class Circle(val radius : Double) : Shapes("Circle"){

    companion object {
        fun randomCircle(): Circle{
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }

//    val pi = 3.141592
    init {
        println("A $name of radius : $radius is created ")
        println("Area of $name is ${area()}")
        println("Perimeter of $name is ${perimeter()}")

    }

    override fun area() = radius * radius * ImportantNumbers.pi

    override fun perimeter() = 2 * radius * ImportantNumbers.pi

}

package com.KOTLIN.classes

class Circle(val radius : Double) {

    val pi = 3.141592
    init {
        println("A circle of radius : $radius is created ")
        println("Area of circle is ${area()}")
        println("Perimeter of circle is ${perimeter()}")

    }

    fun area() = radius * radius * pi

    fun perimeter() = 2 * pi * radius

}
package com.KOTLIN.classes

class Rectangle(
    val a:Double, val  b:Double
) {
    init {
        println("Sides of Rectangle are, L=$a and B=$b ")
    }

    fun area() = a * b

    fun perimeter() = 2*(a+b)

    fun isSquare() = a.equals(b)
}
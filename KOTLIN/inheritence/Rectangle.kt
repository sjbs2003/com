package com.KOTLIN.inheritence

import kotlin.random.Random

class Rectangle(val a:Double, val  b:Double): Shapes("Rectangle"){

    companion object{
        fun randomRectangle():Rectangle{
            val a = Random.nextDouble(1.0,10.0)
            val b = Random.nextDouble(1.0,10.0)
            return Rectangle(a, b)
        }
    }

    constructor(a:Double) : this(a,a)
    constructor(a:Int,b: Int) : this(a.toDouble(),b.toDouble())
    init {
        println("Sides of $name are, L=$a and B=$b ")
        println("Area of Rectangle is ${area()}")
        println("Perimeter of Rectangle is ${perimeter()}")
        println("is it Square ?: ${isSquare()}")
    }

    override fun area() = a * b

    override fun perimeter() = 2*(a+b)

    private fun isSquare() = a.equals(b)
}
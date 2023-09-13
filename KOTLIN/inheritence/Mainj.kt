package com.KOTLIN.inheritence

import java.awt.Shape

//fun main(){
//    val rec = Rectangle(4.3,5.2)
//    rec.changeName("viki")
//    println(rec.name)
//
//    val circle =Circle(2.5)    // circle is instance of Circle class
//    circle.changeName("sj")
//    println(circle.name)
//
//    val circle2 = Circle(5.0)
//
//    val tri = Triangle(5.0,8.0,9.0,)
//    tri.changeName("Suraj")
//    println(tri.name)



// FOR CONSTRUCTORS
//    val rect = Rectangle(1.0)
//    val cir = Circle(5.0)
//    val tri = Triangle(7.0,4.0,6.0)
//
//    val maxAreaRectAndCir = maxArea(rect,cir)
//    val maxAreaRectCirAndTri = maxArea(rect,cir,tri)
//
//    println("The maximum area of Rectangle and Circle is $maxAreaRectAndCir")
//    println("The maximum area of Rectangle, Circle and Triangle is $maxAreaRectCirAndTri")


// FOR OBJECTS AND COMPANION OBJECTS
//    val cir = Circle.randomCircle()
//
//    val rec = Rectangle.randomRectangle()

//}

// OVERLOADING OF A FUNCTION
//fun maxArea(Shape1:Shapes,Shape2:Shapes):Double{
//    val Shape1Area = Shape1.area()
//    val Shape2Area = Shape2.area()
//    return if (Shape1Area > Shape2Area) Shape1Area else Shape2Area
//}
//fun maxArea(Shape1:Shapes,Shape2:Shapes,Shape3:Shapes):Double{
//    val maxAreaShape1Shape2 = maxArea(Shape1,Shape2)
//    val Shape3Area = Shape3.area()
//    return if (maxAreaShape1Shape2 > Shape3Area) maxAreaShape1Shape2 else Shape3Area
//}



// FOR ANONYMOUS CLASS
fun main(){
    val a = 2.0
    val b = 4.0
    val height = 1.0

    val parallelogram = object : Shapes("Parallelogram", a,b,height){

        init {
            println("Parallelogram is created with side a = $a, b = $b and height = $height")
            println("Area of Parallelogram is ${area()}")
            println("perimeter of Parallelogram is ${perimeter()}")

        }
         override fun area(): Double{
             return a * height
         }
        override fun perimeter(): Double{
            return 2*(a+b)
        }
        fun isRectangle(): Boolean = height == b
    }
    println("Is Parallelogram a Rectangle ? : ${parallelogram.isRectangle()}")
}
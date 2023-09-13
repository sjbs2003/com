package com.KOTLIN.inheritence

import java.awt.Shape

fun main() {

    val circle1 = Circle(3.0)
    val circle2 = Circle(5.0)
    val rec1 = Rectangle(3.0, 5.0)
    val rec2 = Rectangle(3.0, 7.0)
    val tri1 = Triangle(12.0, 45.0, 88.0)
    val tri2 = Triangle(2.0, 4.0, 8.0)

    var shape = listOf(rec1, rec2, circle1, circle2, tri1, tri2)
    shape = shape.filter { it.area() > 20.0 }.sortedBy { it.area() }
    for (shapes in shape) {
        println("${shapes.name}: Area = ${shapes.area()}")
    }

    // CUSTOM FILTER USED
//    var shape = listOf(rec1, rec2, circle1, circle2, tri1, tri2)
//    shape = shape.customFilter { it.area() > 20.0 }.sortedBy { it.area() }
//    for (shapes in shape) {
//        println("${shapes.name}: Area = ${shapes.area()}")
//    }
}

// CUSTOM FILTER FUNCTION IS MADE
//fun List<shapes>.customFilter(filterFunction: (Shape) -> (Boolean) ): List<Shape>{
//    val resultList = mutableListOf<shapes>()
//    for (shapes in this){
//        if(filterFunction(shapes)){
//            resultList.add(shapes)
//        }
//    }
//    return resultList
//}
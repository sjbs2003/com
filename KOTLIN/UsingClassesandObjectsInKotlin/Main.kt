package com.KOTLIN.UsingClassesandObjectsInKotlin

fun main(){
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium1 = Aquarium1()
    myAquarium1.printSize()

    // default height and length
    val aquarium2 = Aquarium1(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium1(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium1(width = 25, height = 35, length = 110)
    aquarium4.printSize()

}




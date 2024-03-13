package com.KOTLIN.UsingClassesandObjectsInKotlin

// In some programming languages like Java, the constructor is defined by creating a method within the class that
// has the same name as the class. In Kotlin, you define the constructor directly in the class declaration itself,
// specifying the parameters inside parentheses as if the class was a method. As with functions in Kotlin,
// those parameters can include default values.
class Aquarium {
    var width: Int = 40
    var height: Int = 60
    var length: Int = 100

    constructor(numberOfFish: Int) : this(){
        val tank = numberOfFish * 2000 *1.1
    }

    constructor()

    fun printSize(){
        println(" Width: $width cm " +
                " Height: $height cm " +
                " Length: $length cm "
        )
    }
}

class Aquarium1(var length: Int = 100,var width:Int = 20,var height: Int = 40){
    init {
        println("Aquarium initializing")
    }
    init {
        println("Volume: ${width * length * height / 1000} liters")
    }
    fun printSize(){
        println(" Width: $width cm " +
                " Height: $height cm " +
                " Length: $length cm "
        )
    }
}


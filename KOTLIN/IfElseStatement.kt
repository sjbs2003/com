package com.KOTLIN

fun main(){
    val flag: String? = readlnOrNull()

//    if (Flag == "Red") {
//        println("In the pits!")
//    } else if(Flag == "Yellow"){
//        println("Slow!, Behind the Safety Car")
//    } else if (Flag == "Blue"){
//        println("Let the lapping cars pass!")
//    } else if (Flag == "Green"){
//        println("Go Go Go")
//    } else println("Run over these piece of shit!")


    val message =
    if (flag == "red") "In the pits!"
    else if(flag == "yellow") "Slow!, Behind the Safety Car"
    else if (flag == "blue") "Let the lapping cars pass!"
    else if (flag == "green") "Go Go Go"
    else "Run over these piece of shit!"
    println(message)
}
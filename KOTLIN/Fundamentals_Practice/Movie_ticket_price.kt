package com.KOTLIN.Fundamentals_Practice

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean) {
    // Fill in the code.
    val message = when(age){
        in 0..18 -> "$15"
        in 19..50 -> "$25"
        else -> "$20"
    }
    println(message)
}
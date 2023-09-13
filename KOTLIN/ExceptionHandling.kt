package com.KOTLIN

import java.lang.NumberFormatException

//fun main(){
//    print("enter a no: ")
//    val input = try {
//        readlnOrNull()?.toInt()
//    }
//    catch (e: NumberFormatException){
//        0
//    }
//    finally {
//        println("I will become a very good software developer")
//    }
//    println("Input is $input")
//}

fun main(){
    val div = try {
        division(5,0)
    }catch (e:DivisionByZero){
        0
    }
    println("The result of division is $div")
}

class DivisionByZero : Exception("you cannot divide by zero choose an another no!")
fun division(a:Int,b:Int):Int{
    if (b==0){
        throw DivisionByZero()
    }
    return a/b
}
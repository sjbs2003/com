package com.KOTLIN

fun main(){
    val age = readLine()?.toInt()

    when(age){
        in 0..5 -> println("U cute creature!")
        in 6..17 -> println("Annoying bastards, After hitting Puberty these guys have the worst time to deal with!")
        18 -> println("yeah U must be happy but don't let it go")
        19,20 -> println("Stay there and fight to learn")
        in 21..45 -> println("you will do what it takes to fulfill the dreams")
        else -> println("MID-LIFE CRISIS IS KNOCKING AT THE DOOR NOW GO FIND GOD, THOUGH EVERYBODY DO THIS!")
    }
}
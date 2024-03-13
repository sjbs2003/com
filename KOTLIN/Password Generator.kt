package com.KOTLIN

import java.security.SecureRandom

fun main(){
    val securePassword = generateRandomPassword(12)
    println(securePassword)
}
fun generateRandomPassword(length: Int): String{
    val charset = ('A'..'Z')+('a'..'z')+('0'..'9') + listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')','[',']','{','}')
    val secureRandom = SecureRandom()
    return(1..length)
        .map { charset[secureRandom.nextInt(charset.size)] }
        .joinToString("")
}


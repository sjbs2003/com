package com.KOTLIN


fun List<Int>.product():Int{
    var result =1
    for (value in this){
        result *= value
    }
    return result
}
fun main(){
    val list = listOf(1,2,3,4,5,6)
    println("The product of $list is ${list.product()}")
}

package com.KOTLIN

fun main(){
    val list = listOf(1,2,3,4,5)
    val array = arrayOf(1,2,3,4,5)

    println("List:$list")
    printAlternately(array)

}
fun printAlternately(list: List<Int>){
    var i=0
    var j= list.size-1
    var toggle = true
    while (i <= j){
        if (toggle){
            println(list[i])
            i++
        } else {
            println(list[j])
            j--
        }
        toggle = !toggle
    }
}
fun printAlternately(array: Array<Int>){
    var i=0
    var j= array.size-1
    var toggle = true
    while (i <= j){
        if (toggle){
            println(array[i])
            i++
        } else {
            println(array[j])
            j--
        }
        toggle = !toggle
    }
}
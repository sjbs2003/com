package com.KOTLIN

fun main(){
//    Power(2,4)
//    Power(3,5)

//    Sum(5)

//    val list = listOf(1,2,3)
//    printFirstItem(list)

//    val list1 = listOf(3,2,5,1,5,6,7)
//    val target = readlnOrNull()?.toInt()
//    println(target?.let { linearSearch(list1, it) })

//    searchFor("How to stay calm in difficult situation")
//    searchFor("How to become best programmer", "Arc")
//    searchFor(searchEngine = "Arc", search = "How to be a ass!")


}

fun Power(base : Int, exponent: Int){
    var result =1
    for (i in 1..exponent){
        result *= base
    }
    println("$base to the power of $exponent is $result")
}

fun Sum(n: Int){
    var sum =0
    for (i in 1..n){
        sum += i
    }
    println(" The sum of the values from 1 to $n is $sum")
}

fun printFirstItem(list: List<Int>) = println(list[0])

fun linearSearch(list1: List<Int>, target:Int): Int {
    if(list1.isEmpty()){
        return -1
    }
    for (i in list1){
        val element = list1[i]
        if (element == target){
            return i
        }
    }
    return -1
}

fun searchFor(search:String, searchEngine: String="Google"){
    println("Searching for $search, on $searchEngine")
}
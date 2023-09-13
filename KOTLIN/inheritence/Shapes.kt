package com.KOTLIN.inheritence

import java.awt.Dimension

abstract class Shapes(
    var name: String
) {

    constructor(name: String, vararg dimension: Double): this(name)
    init {
        println("I am the superclass")
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double
    fun changeName(newName:String){
        name = newName
    }
}
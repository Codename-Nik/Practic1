package org.example

import kotlin.random.Random

fun main() {
    // 1 Zadanie
    //println("Hello World!")
    //2 Zadanie
    val arrays = arrayOf(5, 6, 9, 1)
    println(arrays[1])
    arrays[3] = 82

    for (i in 100 downTo 0 step 9) {
        println(arrays[i])
    }
}


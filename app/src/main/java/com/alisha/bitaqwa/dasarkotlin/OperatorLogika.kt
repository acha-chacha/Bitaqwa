package com.alisha.bitaqwa.dasarkotlin

fun main() {
    val a = 10
    val b = 5
    val c = 15

    val contoh = false
    var hasil : Boolean

    //////////////////

    hasil = (a>b) && (a>c) //true && false
    println(hasil)

    hasil = (a>b) || (a>c) //true || false
    println(hasil)

    hasil = !contoh //!false
    println(hasil)
}
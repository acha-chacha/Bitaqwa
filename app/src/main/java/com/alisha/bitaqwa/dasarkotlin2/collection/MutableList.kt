package com.alisha.bitaqwa.dasarkotlin2

fun main() {
    //Data nya bisa diubah
    val mutableList = mutableListOf("Aji", "Haidar", "Haura")
    mutableList.add("Azis")
    for (guruAndroid in mutableList)
        println(guruAndroid)
}
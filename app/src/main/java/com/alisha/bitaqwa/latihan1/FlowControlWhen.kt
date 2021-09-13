package com.alisha.bitaqwa.latihan1

fun main() {
    var makanan = "sushi"
    var asalMakanan = when(makanan){
        "sushi" -> "jepang"
        "tteokbokki" -> "korea"
        "pasta" -> "italia"
        else -> "asal tidak diketahui"
    }
    println(asalMakanan)
}
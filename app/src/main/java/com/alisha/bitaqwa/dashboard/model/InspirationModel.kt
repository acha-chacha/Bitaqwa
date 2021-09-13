package com.alisha.bitaqwa.dashboard.model

//Kita mau pake data apa aja sih di Recycler View? Image
//Biar Recycler View tau data apa yang ingin ditampilkan
//Berfungsi untuk menyimpan/menampung data supaya bisa di akses
// Data Class = Class untuk menampung data
data class InspirationModel (
    //Kenapa pake data Integer? Karena tipe data gambar itu Integer
    //Isinya "0" berfungsi untuk mengatur nilai default nya
    var inspirationImageModel : Int = 0
)
package com.alisha.bitaqwa.dashboard.data

import com.alisha.bitaqwa.R
import com.alisha.bitaqwa.dashboard.model.InspirationModel

object InspirationData {

    //Membuat variable untuk daftar gambar dari drawable
    //Set data
    private val inspirationImage = intArrayOf(
        R.drawable.img_inspiration,
        R.drawable.img_inspiration1,
        R.drawable.img_inspiration2,
        R.drawable.img_inspiration3,
        R.drawable.img_inspiration4
    )

    //Untuk memproses data dari variable di atas (inspirationImage)
    val listData : ArrayList<InspirationModel>

    get() {
        //Untuk menampung data dari hasil looping
        //Melooping sesuai jumlah data
        val list = arrayListOf<InspirationModel>()
        for (position in inspirationImage.indices){

            val inspiration = InspirationModel()
            //position = untuk mengatur item sesuai posisinya
            inspiration.inspirationImageModel = inspirationImage[position]
            //list.add = untuk menambah list
            list.add(inspiration)
        }
        //dari get harus punya nilai return (mengembalikan nilai)
        return list
    }
}
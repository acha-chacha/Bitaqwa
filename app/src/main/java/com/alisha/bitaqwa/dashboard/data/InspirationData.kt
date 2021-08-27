package com.alisha.bitaqwa.dashboard.data

import com.alisha.bitaqwa.R
import com.alisha.bitaqwa.dashboard.model.InspirationModel

object InspirationData {
    private val inspirationImage = intArrayOf(
        R.drawable.img_inspiration,
        R.drawable.img_inspiration1,
        R.drawable.img_inspiration2,
        R.drawable.img_inspiration3,
        R.drawable.img_inspiration4
    )

    //Memproses data dari variable di atas (inspirationImage)
    val listData : ArrayList<InspirationModel>
    get() {
        val list = arrayListOf<InspirationModel>()
        for (position in inspirationImage.indices){
            val inspiration = InspirationModel()
            inspiration.inspirationImageModel = inspirationImage[position]
            list.add(inspiration)
        }
        return list
    }
}
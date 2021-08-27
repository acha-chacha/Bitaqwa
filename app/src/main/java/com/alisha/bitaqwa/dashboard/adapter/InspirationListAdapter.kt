package com.alisha.bitaqwa.dashboard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.alisha.bitaqwa.R
import com.alisha.bitaqwa.dashboard.model.InspirationModel
import com.bumptech.glide.Glide

class InspirationListAdapter (private val listInspiration:ArrayList<InspirationModel>) :
        RecyclerView.Adapter<InspirationListAdapter.ListViewHolder>(){

    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto : ImageView = itemView.findViewById(R.id.iv_item_photo)
    }

    //untuk menentukan layout atau tempat data yang akan ditampilkan
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): InspirationListAdapter.ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_inspiration, parent, false)

        return ListViewHolder(view)
    }

    //untuk menampilkan data pada komponen layout yangtelah ditentukan pada fungsi onCreateViewHolder
    override fun onBindViewHolder(holder: InspirationListAdapter.ListViewHolder, position: Int) {
        val inspiration = listInspiration[position]

        //Glide = library untuk menampilkan gambar pada recycler view
        Glide.with(holder.itemView.context)
            .load(inspiration.inspirationImageModel)
            .into(holder.imgPhoto)

    }

    //untuk menentukan jumlah data yang akan ditampilkan
    override fun getItemCount(): Int {
        return listInspiration.size
    }


}
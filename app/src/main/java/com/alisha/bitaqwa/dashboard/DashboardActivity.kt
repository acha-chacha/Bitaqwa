package com.alisha.bitaqwa.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alisha.bitaqwa.R
import com.alisha.bitaqwa.dashboard.adapter.InspirationListAdapter
import com.alisha.bitaqwa.dashboard.data.InspirationData
import com.alisha.bitaqwa.dashboard.model.InspirationModel
import com.alisha.bitaqwa.menus.doa.MenuDoaActivity
import com.alisha.bitaqwa.menus.dzikir.MenuDzikirActivity
import com.alisha.bitaqwa.menus.jadwalsholat.MenuJadwalSholatActivity
import com.alisha.bitaqwa.menus.videokajian.MenuVideoKajianActivity
import com.alisha.bitaqwa.menus.zakat.MenuZakatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        initNavMenu()
        initHeader()
        initRecyclerViewInspiration()
    }

    /*
    STEP Menggunakan Recycler View
    1. Membuat Recycler View di XML utama (Dashboard Activity)
    2. Membuat tampilan item pada layout yang berbeda
    3. Membuat Model
    4. Membuat Data
    5. Membuat Adapter
    6. Initialize pada activity Recycler View (Dashboard Activity)
     */

    private fun initRecyclerViewInspiration() {
        val list : ArrayList<InspirationModel> = arrayListOf()
        //setHasFixedSized = untuk menatur ukuran recycler view
        rv_inspiration.setHasFixedSize(true)
        //addAll dipakai karena kita menggunakan lebih dari satu data
        list.addAll(InspirationData.listData)

        //untuk membuat tampilan Recycler View nya linear (vertical)
        rv_inspiration.layoutManager = LinearLayoutManager(this)
        //untuk memanggil adapter
        rv_inspiration.adapter = InspirationListAdapter(list)
    }

    private fun initHeader() {
        val timeNow = Calendar.getInstance()
        val timeFormat = SimpleDateFormat("HH")
        val time = timeFormat.format(timeNow.time)

        when{
            time.toInt() in 0..6 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_night)
            }

            time.toInt() in 7..12 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_morning)
            }

            time.toInt() in 13..18 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_afternoon)
            }

            time.toInt() in 19..23 -> {
                iv_header.setBackgroundResource(R.drawable.bg_header_dashboard_night)
            }
        }
    }

    private fun initNavMenu() {
        iv_icon_menu_doa.setOnClickListener {
            startActivity(Intent(this, MenuDoaActivity::class.java))
        }

        iv_icon_menu_dzikir.setOnClickListener {
            startActivity(Intent(this, MenuDzikirActivity::class.java))
        }

        iv_icon_menu_jadwal_sholat.setOnClickListener {
            startActivity(Intent(this, MenuJadwalSholatActivity::class.java))
        }

        iv_icon_menu_video_kajian.setOnClickListener {
            startActivity(Intent(this, MenuVideoKajianActivity::class.java))
        }

        iv_icon_menu_zakat.setOnClickListener {
            startActivity(Intent(this, MenuZakatActivity::class.java))
        }

    }
}
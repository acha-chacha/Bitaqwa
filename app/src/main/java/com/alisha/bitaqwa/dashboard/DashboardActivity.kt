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

    private fun initRecyclerViewInspiration() {
        val list : ArrayList<InspirationModel> = arrayListOf()
        rv_inspiration.setHasFixedSize(true)
        list.addAll(InspirationData.listData)

        rv_inspiration.layoutManager = LinearLayoutManager(this)
        val listInspirationAdapter = InspirationListAdapter(list)
        rv_inspiration.adapter = listInspirationAdapter
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
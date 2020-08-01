package com.example.k_league

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.teamdetail_screen.*

class teamdetailScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.teamdetail_screen)

        team_back_button.setOnClickListener {
            finish()
        }

        val list = ArrayList<teamdetailItem>()
        list.add(teamdetailItem(getDrawable(R.drawable.seoul)!!, getString(R.string.fw_01)))
        list.add(teamdetailItem(getDrawable(R.drawable.seoul)!!, getString(R.string.mf_01)))


        val staffAdapter = teamdetailRecyclerAdapter(list)
        staffRecyclerView.adapter = staffAdapter

        val fwAdapter = teamdetailRecyclerAdapter(list)
        fwRecyclerView.adapter = fwAdapter

        val mfAdapter = teamdetailRecyclerAdapter(list)
        mfRecyclerView.adapter = mfAdapter

        val dfAdapter = teamdetailRecyclerAdapter(list)
        dfRecyclerView.adapter = dfAdapter

        val gkAdapter = teamdetailRecyclerAdapter(list)
        gkRecyclerView.adapter = gkAdapter
    }
}
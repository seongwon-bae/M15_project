package com.example.k_league

import android.content.AbstractThreadedSyncAdapter
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class teamScreenActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_screen)

        viewManager = GridLayoutManager(this)
        viewAdapter = MyAdapter(myDataset)

        recyclerView = findViewById<RecyclerView>(R.id.teamscreen_recycler_view).apply{
            setHasFixedSize(true)

            layoutManager = viewManager

            adapter = viewAdapter
        }

        val selected_button = findViewById<ImageButton>(R.id.gangwon)
        selected_button.setOnClickListener {
            val nextIntent = Intent(this, teamdetailScreenActivity)
            startActivity(nextIntent)
        }

    }
}

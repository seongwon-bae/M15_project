package com.example.k_league

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class teamdetailScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.teamdetail_screen)

        val team_name = findViewById<TextView>(R.id.team_name)
        team_name
    }
}
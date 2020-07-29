package com.example.k_league

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class teamdetailScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.teamdetail_screen)

        val teamScreenBackbutton = findViewById<Button>(R.id.team_back_button)


    }
}
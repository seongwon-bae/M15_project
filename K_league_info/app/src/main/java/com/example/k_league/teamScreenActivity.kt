package com.example.k_league

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class teamScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_screen)

        val selected_button = findViewById<ImageButton>(R.id.gangwon)
        selected_button.setOnClickListener {
            val nextIntent = Intent(this, teamdetailScreenActivity)
            startActivity(nextIntent)
        }

    }
}
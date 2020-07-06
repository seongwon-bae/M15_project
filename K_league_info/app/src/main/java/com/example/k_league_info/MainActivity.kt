package com.example.k_league_info

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        score.setOnClickListener {
            val nextIntent = Intent(this, ScoreScreen::class.java)
            startActivity(nextIntent)
        }
        team.setOnClickListener {
            val nextIntent = Intent(this, teamScreen::class.java)
            startActivity(nextIntent)
        }
        community.setOnClickListener {
            val nextIntent = Intent(this, communityScreen::class.java)
            startActivity(nextIntent)
        }
    }
}

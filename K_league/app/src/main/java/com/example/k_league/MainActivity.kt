package com.example.k_league

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        score.setOnClickListener {
            val nextIntent = Intent(this, scoreScreen::class.java)
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
}
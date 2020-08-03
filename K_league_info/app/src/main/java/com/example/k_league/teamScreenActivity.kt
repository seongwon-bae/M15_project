package com.example.k_league

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.team_screen.*

class teamScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_screen)

        // 1
        gangwonImagebutton.setOnClickListener{
            val nextIntent:Intent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 2
        busanImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 3
        daeguImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 4
        gwangjuImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 5
        incheonImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 6
        jejuImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 7
        jeonnamImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 8
        pohangImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 9
        sangjuImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 10
        ulsanImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 11
        seoulImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }

        // 12
        ulsanImagebutton.setOnClickListener {
            val nextIntent = Intent(this@teamScreenActivity, teamdetailScreenActivity::class.java)
            startActivity(nextIntent)
        }
    }
}

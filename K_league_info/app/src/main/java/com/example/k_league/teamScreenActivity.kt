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
            val nextIntent = Intent()
        }
        val selectJeonnam = findViewById<ImageButton>(R.id.jeonnamImagebutton)
        selectJeonnam.setOnClickListener {  }

        // 8
        val selectPohang = findViewById<ImageButton>(R.id.pohangImagebutton)
        selectPohang.setOnClickListener {  }

        // 9
        val selectSangju = findViewById<ImageButton>(R.id.sangjuImagebutton)
        selectSangju.setOnClickListener {  }

        // 10
        val selectSeongnam = findViewById<ImageButton>(R.id.seoulImagebutton)
        selectSeongnam.setOnClickListener {  }

        // 11
        val selectSeoul = findViewById<ImageButton>(R.id.seoulImagebutton)
        selectSeoul.setOnClickListener {  }

        // 12
        val selectUlsan = findViewById<ImageButton>(R.id.ulsanImagebutton)
        selectUlsan.setOnClickListener {  }

    }
}

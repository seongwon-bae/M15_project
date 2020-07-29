package com.example.k_league

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class teamScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_screen)

        // 1
        val selectGangwon = findViewById<ImageButton>(R.id.gangwonImagebutton)
        selectGangwon.setOnClickListener {  }

        // 2
        val selectBusan = findViewById<ImageButton>(R.id.busanImagebutton)
        selectBusan.setOnClickListener{  }

        // 3
        val selectDaegu = findViewById<ImageButton>(R.id.daeguImagebutton)
        selectDaegu.setOnClickListener {  }

        // 4
        val selectGwangju = findViewById<ImageButton>(R.id.gwangjuImagebutton)
        selectGwangju.setOnClickListener{  }

        // 5
        val selectIncheon =findViewById<ImageButton>(R.id.incheonImagebutton)
        selectIncheon.setOnClickListener {  }

        // 6
        val selectJeju = findViewById<ImageButton>(R.id.jejuImagebutton)
        selectJeju.setOnClickListener {  }

        // 7
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

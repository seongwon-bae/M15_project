package com.example.k_league

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.k_league.R
import kotlinx.android.synthetic.main.activity_post_write.*
/*
    게시물을 작성 시 보여질 화면
 */
class postWrite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_write)

        ok.setOnClickListener {
            finish()
        }
        cancel.setOnClickListener {
            finish()
        }
    }
}
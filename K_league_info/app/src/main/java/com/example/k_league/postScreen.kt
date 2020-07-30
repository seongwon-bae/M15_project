package com.example.k_league

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.k_league.R
import kotlinx.android.synthetic.main.activity_post_screen.*
/*
    게시물을 클릭 시 보여질 화면
 */
class postScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_screen)

        val number = intent.getStringExtra("key")
        num.setText(number)
        val context = "제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용" +
                "제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용" +
                "제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용" +
                "제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용" +
                "제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용" +
                "제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용" +
                "제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용" +
                "제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용" +
                "제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용제목이 곧 내용"
        content.setText(context)
    }
}
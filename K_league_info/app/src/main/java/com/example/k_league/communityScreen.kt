package com.example.k_league

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.k_league.R
import com.example.k_league.communityFragment
import com.example.k_league.postWrite
import com.example.k_league.bestcommunityFragment
import kotlinx.android.synthetic.main.community_screen.*

class communityScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.community_screen)

/*
        val community_adapter = communityAdapter(this, board_list)
        c_recycler.adapter = community_adapter

        val lm = LinearLayoutManager(this)
        c_recycler.layoutManager = lm
        c_recycler.setHasFixedSize(true)
 */

/*
    화면에 기본으로 전체글 프래그먼트를 출력
    각 버튼 클릭 시 전체글과 인기글을 구분하고
    게시물 작성을 위한 버튼을 클릭 시 게시물 작성 액티비티 실행        
 */
        
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, communityFragment())
            .commit()
        
        all.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, communityFragment())
                .commit()
        }
        best.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, bestcommunityFragment())
                .commit()
        }

        write.setOnClickListener {
            val intent = Intent(this, postWrite::class.java)
            startActivity(intent)
        }
    }

}

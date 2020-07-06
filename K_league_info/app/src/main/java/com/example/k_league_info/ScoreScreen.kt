package com.example.k_league_info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_score_screen.*

class ScoreScreen : AppCompatActivity() {

    var scoreList = arrayListOf<Score_item>(
        Score_item("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_screen)

        val mAdapter = ScoreRvAdapter(this, scoreList)
        mRecyclerView.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        mRecyclerView.layoutManager = lm
        mRecyclerView.setHasFixedSize(true)
    }
}
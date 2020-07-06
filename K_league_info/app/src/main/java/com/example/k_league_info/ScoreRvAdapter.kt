package com.example.k_league_info

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ScoreRvAdapter(val context: Context, val scoreList: ArrayList<Score_item>) :
    RecyclerView.Adapter<ScoreRvAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_score_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return scoreList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(scoreList[position], context)
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val scorePosition = itemView?.findViewById<TextView>(R.id.textView)
        val scoreBackNumber  = itemView?.findViewById<TextView>(R.id.textView2)
        val scorePlayer = itemView?.findViewById<TextView>(R.id.textView3)
        val scoreReplacement = itemView?.findViewById<TextView>(R.id.textView4)
        val scoreGoal = itemView?.findViewById<TextView>(R.id.textView5)
        val scoreAssistance = itemView?.findViewById<TextView>(R.id.textView6)
        val scoreShooting = itemView?.findViewById<TextView>(R.id.textView7)
        val scoreFoul = itemView?.findViewById<TextView>(R.id.textView8)
        val scoreYellowCard = itemView?.findViewById<TextView>(R.id.textView9)
        val scoreRedCard = itemView?.findViewById<TextView>(R.id.textView10)
        val scoreCornerKick = itemView?.findViewById<TextView>(R.id.textView11)
        val scoreOffside = itemView?.findViewById<TextView>(R.id.textView12)

        fun bind (score: Score_item, context: Context) {
            scorePosition?.text = score.position
            scoreBackNumber?.text = score.backNumber
            scorePlayer?.text = score.player
            scoreReplacement?.text = score.replacement
            scoreGoal?.text = score.goal
            scoreAssistance?.text = score.assistance
            scoreShooting?.text = score.shooting
            scoreFoul?.text = score.foul
            scoreYellowCard?.text = score.yellowCard
            scoreRedCard?.text = score.redCard
            scoreCornerKick?.text = score.cornerKick
            scoreOffside?.text = score.offside
        }
    }
}
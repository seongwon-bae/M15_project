package com.example.k_league

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.k_league.R
import kotlinx.android.synthetic.main.item_board.view.*

/*
    리사이클러뷰 어댑터
 */
class communityAdapter(val context: Context, val boardList: ArrayList<communityBoard>) : RecyclerView.Adapter<communityAdapter.Holder>() {
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val number = itemView.findViewById<TextView>(R.id.number)
        val title = itemView.findViewById<TextView>(R.id.title)
        val recommand = itemView.findViewById<TextView>(R.id.recommand)
        val content = itemView.findViewById<TextView>(R.id.content)
        val comment = itemView.findViewById<TextView>(R.id.comment)

        fun bind (communityBoard: communityBoard, context: Context) {
            number.text = communityBoard.number
            title.text = communityBoard.title
            recommand.text = communityBoard.recommend
            content.text = communityBoard.content
            comment.text = communityBoard.comment
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_board, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return boardList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(boardList[position], context)
/*
    해당 글 클릭 시 intent로 게시글 번호가 넘어감
 */
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, postScreen::class.java)
            val key = holder.itemView.number.text
            intent.putExtra("key", key)
            context.startActivity(intent)
        }
    }
}
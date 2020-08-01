package com.example.k_league

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.teamdetail_item_screen.view.*

class teamdetailRecyclerAdapter(private val items: ArrayList<teamdetailItem>) :
        RecyclerView.Adapter<teamdetailRecyclerAdapter.ViewHolder>() {

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: teamdetailRecyclerAdapter.ViewHolder, position: Int) {
        val item = items[position]
        val listener = View.OnClickListener {it ->
            Toast.makeText(it.context, "Clicked: ${item.name}", Toast.LENGTH_SHORT).show()
        }
        holder.apply {
            bind(listener, item)
            itemView.tag = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            teamdetailRecyclerAdapter.ViewHolder {
        val inflatedView = LayoutInflater.from(parent.context)
                .inflate(R.layout.teamdetail_item_screen, parent, false)
        return teamdetailRecyclerAdapter.ViewHolder(inflatedView)
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        private var view: View = v

        fun bind(listener: View.OnClickListener, item: teamdetailItem) {
            view.thumbnail.setImageDrawable(item.image)
            view.name.text = item.name
            view.setOnClickListener(listener)
        }
    }
}
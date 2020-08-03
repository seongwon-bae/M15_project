package com.example.k_league.ui.score

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.k_league.R

class Score {
    fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_score, container, false)

        view.findViewById<Button>(R.id.navigation_score).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_score_to_team)
        }
        view.findViewById<Button>(R.id.navigation_team).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_score_to_community)
        }
        return view
    }
}
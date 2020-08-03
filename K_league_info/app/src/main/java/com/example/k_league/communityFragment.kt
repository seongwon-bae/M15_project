package com.example.k_league

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_bestcommunity.*
import kotlinx.android.synthetic.main.fragment_community.*
/*
    전체글 화면을 출력하기 위한 프래그먼트
 */
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class communityFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_community, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            var boardList = arrayListOf<communityBoard>(
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수"),
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수"),
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수"),
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수"),
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수"),
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수"),
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수"),
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수"),
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수"),
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수"),
                    communityBoard("번호","제목자리","내용자리","추천수", "댓글수")
            )
        //구분선 추가
        val decoration = DividerItemDecoration(view.context, 1)
        CRecycler.addItemDecoration(decoration)
        
        val communityAdapter = activity?.let { communityAdapter(it, boardList) }
        CRecycler.adapter = communityAdapter

        val lm = LinearLayoutManager(activity)
        CRecycler.layoutManager = lm
        CRecycler.setHasFixedSize(true)

        //아래로 당겼을때 새로 고쳐지는 코드
        refreshLayout.setOnRefreshListener {
            boardList.add(communityBoard("번호","제목자리","내용자리","추천수", "댓글수"));
            CRecycler.adapter?.notifyDataSetChanged();
            refreshLayout.isRefreshing = false
        }

    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                communityFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}
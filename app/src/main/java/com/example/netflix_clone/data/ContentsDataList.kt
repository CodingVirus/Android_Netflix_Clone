package com.example.netflix_clone.data

import com.example.netflix_clone.R

object ContentsDataList {
    var list: MutableList<ContentsData> = mutableListOf()

    init {
        list.add(ContentsData("지금 뜨는 콘텐츠", R.drawable.aquaman_post))
        list.add(ContentsData("새로 올라온 콘텐츠", R.drawable.wish_post))
        list.add(ContentsData("해외 영화", R.drawable.wonka))
        list.add(ContentsData("국내 영화", R.drawable.migration_post))
        list.add(ContentsData("긴박감 넘치는 시리즈", R.drawable.nightswim_post))
        list.add(ContentsData("다시보기 추천 콘텐츠", R.drawable.ferrari_post))
        list.add(ContentsData("흥미진진한 영화", R.drawable.oppenheimer_post))
        list.add(ContentsData("긴박감 넘치는 시리즈", R.drawable.themarvels_post))
    }
}
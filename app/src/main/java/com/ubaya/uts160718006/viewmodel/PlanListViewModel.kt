package com.ubaya.uts160718006.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.uts160718006.model.Anime

class PlanListViewModel:ViewModel() {
    val planLD = MutableLiveData<List<Anime>>()

    fun refresh(){
        val anime1 =
                Anime("Fate/Stay Night: Unlimited Blade Works",
                        "Action, Supernatural, Magic, Fantasy",
                        25,0,
                        "https://m.media-amazon.com/images/M/MV5BOTg5ZjI5ZTAtOWE2OS00MjY4LWI4ZDQtMzEzMDY4MTgzYWJlXkEyXkFqcGdeQXVyNjc3OTE4Nzk@._V1_.jpg")
        val anime2 =
                Anime("Wotaku ni Koi wa Muzukashii",
                        "Comedy, Romance, Slice of Life",
                        12,0,
                        "https://cdn.myanimelist.net/images/anime/1864/93518.jpg")
        val anime3 =
                Anime("Noragami",
                        "Action, Adventure, Comedy, Supernatural, Shounen",
                        12,0,
                        "https://cdn.myanimelist.net/images/anime/9/77809.jpg")
        val anime4 =
                Anime("Golden Time",
                        "Comedy, Drama, Romance",
                        24,0,
                        "https://cdn.myanimelist.net/images/anime/12/52091.jpg")

        planLD.value = arrayListOf<Anime>(anime1, anime2, anime3, anime4)


    }
}
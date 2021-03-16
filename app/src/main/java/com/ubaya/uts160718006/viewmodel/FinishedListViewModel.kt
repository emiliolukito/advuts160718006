package com.ubaya.uts160718006.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.uts160718006.model.Anime

class FinishedListViewModel: ViewModel() {
    val finishedLD = MutableLiveData<List<Anime>>()
    fun refresh(){
        val anime1 =
                Anime("Yesterday wo Utatte",
                        "Drama, Romance, Slice of Life, Seinen",
                        12,12,
                        "https://cdn.myanimelist.net/images/anime/1584/104517l.jpg")
        val anime2 =
                Anime("Tate no Yuusha no Nariagari",
                        "Action, Adventure, Drama, Fantasy",
                        24,24,
                        "https://cdn.myanimelist.net/images/anime/1490/101365.jpg")

        val anime3 =
                Anime("Darwin's Game",
                        "Action, Sci-Fi, Mystery, Super Power, Shounen",
                        11,11,
                        "https://cdn.myanimelist.net/images/anime/1016/107222.jpg")

        val anime4 =
                Anime("Shigatsu wa Kimi no Uso",
                        "Drama, Music, Romance, School, Shounen",
                        22,22,
                        "https://static.wikia.nocookie.net/shigatsu-wa-kimi-no-uso/images/0/0f/ImgTop3.jpg/revision/latest?cb=20141018011830")

        finishedLD.value = arrayListOf<Anime>(anime1, anime2, anime3, anime4)


    }
}
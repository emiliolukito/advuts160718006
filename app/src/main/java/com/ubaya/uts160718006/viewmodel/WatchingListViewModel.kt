package com.ubaya.uts160718006.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.uts160718006.model.Anime

class WatchingListViewModel:ViewModel() {
    val watchingLD = MutableLiveData<List<Anime>>()
    fun refresh(){
        val anime1 =
            Anime("Kimetsu no Yaiba",
                "Demon, Horror, Superntural, Action, Shounen",
                26,10,
                "https://simkl.net/posters/85/85964029165a0e752_ca.jpg")
        val anime2 =
            Anime("Tsuki ga Kirei",
                "Romance, School",
                12,4,
                "https://cdn.myanimelist.net/images/anime/2/85592.jpg")
        val anime3 =
            Anime("Violet Evergarden",
                "Drama, Fantasy, Slice of Life",
                13,4,
                "https://cdn.myanimelist.net/images/anime/1795/95088.jpg")

        watchingLD.value = arrayListOf<Anime>(anime1, anime2, anime3)


    }
}
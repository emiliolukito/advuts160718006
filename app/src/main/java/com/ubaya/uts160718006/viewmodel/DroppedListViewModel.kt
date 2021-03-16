package com.ubaya.uts160718006.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ubaya.uts160718006.model.Anime

class DroppedListViewModel:ViewModel() {
    val droppedLD = MutableLiveData<List<Anime>>()
    fun refresh(){
        val anime1 =
                Anime("White Album 2",
                        "Drama, Music, Romance, Slice of Life",
                        11,13,
                        "https://i.pinimg.com/236x/de/0b/dc/de0bdcf502a3060f3e46dc5f414e9554--white-album--poster-designs.jpg")
        val anime2 =
                Anime("The God of Highschool",
                        "Action, Sci-Fi, Adventure, Comedy, Supernatural, Martial Arts, Fantasy",
                        13,7,
                        "https://m.media-amazon.com/images/M/MV5BYjljYmYzNjMtZWY5YS00OGZjLTk4MTYtNDZmYzkxYjgyMDMzXkEyXkFqcGdeQXVyODM2NjQzOTA@._V1_.jpg")

        droppedLD.value = arrayListOf<Anime>(anime1, anime2)


    }
}
package com.ubaya.uts160718006.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.ubaya.uts160718006.R
import com.ubaya.uts160718006.model.Anime
import kotlinx.android.synthetic.main.watching_list_item.view.*

class WatchingListAdapter(val watchingList:ArrayList<Anime>):RecyclerView.Adapter<WatchingListAdapter.watcingViewHolder>() {
    class watcingViewHolder(val view: View):RecyclerView.ViewHolder(view)

    fun updateWatchingList(newWatchingList:List<Anime>)
    {
        watchingList.clear()
        watchingList.addAll(newWatchingList)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): watcingViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.watching_list_item,parent,false)
        return watcingViewHolder(v)
    }

    override fun getItemCount(): Int {
        return watchingList.size
    }

    override fun onBindViewHolder(holder: watcingViewHolder, position: Int) {
        holder.view.txtTitle.text = watchingList[position].title
        holder.view.txtGenre.text = watchingList[position].genre
        holder.view.txtCurrent.text = watchingList[position].currentEp.toString()
        holder.view.txtEpisodes.text = watchingList[position].episodes.toString()
        Picasso.get().load(watchingList[position].photo).into(holder.view.imgPoster)
    }
}
package com.ubaya.uts160718006.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.ubaya.uts160718006.R
import com.ubaya.uts160718006.model.Anime
import kotlinx.android.synthetic.main.dropped_list_item.view.*

class DroppedListAdapter(val droppedList:ArrayList<Anime>):RecyclerView.Adapter<DroppedListAdapter.DroppedViewHolder>()
{
    class DroppedViewHolder(val view: View):RecyclerView.ViewHolder(view)

    fun updateDroppedList(newDroppedList:List<Anime>)
    {
        droppedList.clear()
        droppedList.addAll(newDroppedList)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DroppedListAdapter.DroppedViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.dropped_list_item,parent,false)
        return DroppedListAdapter.DroppedViewHolder(v)
    }

    override fun getItemCount(): Int {
        return droppedList.size
    }

    override fun onBindViewHolder(holder: DroppedListAdapter.DroppedViewHolder, position: Int) {
        holder.view.txtTitle.text = droppedList[position].title
        holder.view.txtGenre.text = droppedList[position].genre
        holder.view.txtCurrent.text = droppedList[position].currentEp.toString()
        holder.view.txtEpisodes.text = droppedList[position].episodes.toString()
        Picasso.get().load(droppedList[position].photo).into(holder.view.imgPoster)
    }
}
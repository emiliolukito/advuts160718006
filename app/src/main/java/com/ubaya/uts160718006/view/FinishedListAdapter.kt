package com.ubaya.uts160718006.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.ubaya.uts160718006.R
import com.ubaya.uts160718006.model.Anime
import kotlinx.android.synthetic.main.dropped_list_item.view.txtTitle
import kotlinx.android.synthetic.main.finished_list_item.view.*

class FinishedListAdapter(val finishedList:ArrayList<Anime>): RecyclerView.Adapter<FinishedListAdapter.FinishViewHolder>()
{
    class FinishViewHolder(val view: View):RecyclerView.ViewHolder(view)

    fun updateFinishedList(newFinishedList:List<Anime>)
    {
        finishedList.clear()
        finishedList.addAll(newFinishedList)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FinishViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.finished_list_item,parent,false)
        return FinishedListAdapter.FinishViewHolder(v)
    }

    override fun getItemCount(): Int {
        return finishedList.size
    }

    override fun onBindViewHolder(holder: FinishViewHolder, position: Int) {
        holder.view.txtTitle.text = finishedList[position].title
        holder.view.txtGenre.text = finishedList[position].genre
        holder.view.txtCurrent.text = finishedList[position].currentEp.toString()
        holder.view.txtEpisodes.text = finishedList[position].episodes.toString()
        Picasso.get().load(finishedList[position].photo).into(holder.view.imgPoster)
    }
}
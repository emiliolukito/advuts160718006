package com.ubaya.uts160718006.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.ubaya.uts160718006.R
import com.ubaya.uts160718006.model.Anime
import kotlinx.android.synthetic.main.plan_list_item.view.*

class PlanListAdapter(val plamList:ArrayList<Anime>):RecyclerView.Adapter<PlanListAdapter.PlanViewHolder>() {
    class PlanViewHolder(val view:View):RecyclerView.ViewHolder(view)

    fun updatePlanList(newPlanList:List<Anime>)
    {
        plamList.clear()
        plamList.addAll(newPlanList)
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.plan_list_item,parent,false)
        return PlanListAdapter.PlanViewHolder(v)
    }

    override fun getItemCount(): Int {
        return plamList.size
    }

    override fun onBindViewHolder(holder: PlanViewHolder, position: Int) {
        holder.view.txtTitle.text = plamList[position].title
        holder.view.txtGenre.text = plamList[position].genre
        holder.view.txtCurrent.text = plamList[position].currentEp.toString()
        holder.view.txtEpisodes.text = plamList[position].episodes.toString()
        Picasso.get().load(plamList[position].photo).into(holder.view.imgPoster)
    }
}
package com.vishal2376.rebooked.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.vishal2376.rebooked.R
import com.vishal2376.rebooked.models.Org

class OrgAdapter(private val context: Context, private val orgs: List<Org>) :
    Adapter<OrgAdapter.OrgViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrgViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.org_item, parent, false)
        return OrgViewHolder(view)
    }

    override fun getItemCount(): Int {
        return orgs.size
    }

    override fun onBindViewHolder(holder: OrgViewHolder, position: Int) {
        holder.name.text = orgs[position].name
        holder.orgName.text = orgs[position].org

        //animation
        holder.itemView.animation = AnimationUtils.loadAnimation(context, R.anim.slide)

    }

    inner class OrgViewHolder(itemView: View) : ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.tvName)
        val orgName: TextView = itemView.findViewById(R.id.tvOrgName)

    }
}
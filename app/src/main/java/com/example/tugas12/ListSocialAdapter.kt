package com.example.tugas12

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSocialAdapter(private val listAccount: ArrayList<Account>) : RecyclerView.Adapter<ListSocialAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var imgIcon: ImageView = itemView.findViewById(R.id.img_item_icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val account = listAccount[position]

        Glide.with(holder.itemView.context)
            .load(account.icon)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgIcon)

        holder.tvName.text = account.name
    }

    override fun getItemCount(): Int {
        return listAccount.size
    }
}
package com.example.tugas12.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import android.content.Intent
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import android.widget.TextView
import com.example.tugas12.DetailActivity
import com.example.tugas12.R
import com.example.tugas12.model.University
import java.util.ArrayList

class ListUniversityAdapter(private val listUniversity: ArrayList<University>) : RecyclerView.Adapter<ListUniversityAdapter.ListViewHolder>() {
    var onItemClickCallback: OnItemClickCallback? = null

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_university, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val university = listUniversity[position]

        Glide.with(holder.itemView.context)
            .load(university.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = university.name
        holder.tvDetails.text = university.detail

        holder.itemView.setOnClickListener { view ->
            val intent = Intent(view.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_PHOTO, university.photo)
            intent.putExtra(DetailActivity.EXTRA_NAME, university.name)
            intent.putExtra(DetailActivity.EXTRA_DESKRIPSI, university.detail)
            view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listUniversity.size
    }

    inner class ListViewHolder(itemView: View) : ViewHolder(itemView) {
        var imgPhoto: ImageView
        var tvName: TextView
        var tvDetails: TextView

        init {
            imgPhoto = itemView.findViewById(R.id.img_item_photo)
            tvName = itemView.findViewById(R.id.tv_item_name)
            tvDetails = itemView.findViewById(R.id.tv_item_detail)
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: University?)
    }
}
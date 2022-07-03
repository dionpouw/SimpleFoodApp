package com.jeflette.simplefoodapp.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jeflette.simplefoodapp.R
import com.jeflette.simplefoodapp.data.model.Food

class FoodAdapter(private val data: List<Food>) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivFood: ImageView = view.findViewById(R.id.item_iv_food)
        val tvFood: TextView = view.findViewById(R.id.item_tv_food)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_food, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.ivFood.context)
            .load(Uri.parse("res/drawable/ ${data[position].imgResource}"))
            .into(holder.ivFood)
        holder.tvFood.text = data[position].name
    }
    override fun getItemCount(): Int = data.size
}
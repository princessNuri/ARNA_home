package com.example.arnahome.ui.main.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bumptech.glide.Glide
import com.example.arnahome.data.model.ProductResponse
import com.example.arnahome.databinding.ItemFavoriteBinding

class FavoriteAdapter(private val list: MutableList<ProductResponse.Content>): Adapter<FavoriteAdapter.FavoriteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        return FavoriteViewHolder(ItemFavoriteBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class FavoriteViewHolder(private val binding: ItemFavoriteBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(content: ProductResponse.Content) {
            with(binding){
                tvName.text = content.name
                tvItemPrice.text = content.price.toString()
                Glide.with(itemView).load(content.imageUrl).into(tvIm)
            }
        }

    }
}
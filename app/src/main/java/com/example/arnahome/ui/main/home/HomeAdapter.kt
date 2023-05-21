package com.example.arnahome.ui.main.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.example.arnahome.data.model.ProductResponse
import com.example.arnahome.databinding.ItemProductBinding

class HomeAdapter(private val productList: List<ProductResponse.Content>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    inner class ViewHolder(private val binding: ItemProductBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(product: ProductResponse.Content) {
            binding.apply {
                tvProductName.text = product.name
                tvProductPrice.text = product.price.toString()
                tvProductRating.text= product.rating.toString()
                ivProduct.setImageURI(product.imageUrl?.toUri())
                root.setOnClickListener {

                }
            }
        }
    }
}

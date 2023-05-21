package com.example.arnahome.ui.main.notifications.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.example.arnahome.data.model.Notify
import com.example.arnahome.databinding.ItemNotifyBinding

class NotifyAdapter(private val notifyList: List<Notify>) :
    RecyclerView.Adapter<NotifyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemNotifyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val notify = notifyList[position]
        holder.bind(notify)
    }

    override fun getItemCount(): Int {
        return notifyList.size
    }

    inner class ViewHolder(private val binding: ItemNotifyBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(notify: Notify) {
            binding.apply {
                tvNotifyName.text=notify.name
                tvNotifyDesc.text=notify.description
                ivImage.setImageURI(notify.image.toUri())
            }
        }
    }
}

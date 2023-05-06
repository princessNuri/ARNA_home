package com.example.arnahome.core.network.paging

import androidx.recyclerview.widget.DiffUtil


interface IBaseDiffModel<T> {
    val idDif: T
    override fun equals(other: Any?): Boolean
}

class BaseDiffUtilItemCallback<T : IBaseDiffModel<S>, S> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.idDif == newItem.idDif
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
    }
}
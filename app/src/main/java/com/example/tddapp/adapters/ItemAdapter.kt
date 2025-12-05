package com.example.tddapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tddapp.R
import com.example.tddapp.models.ItemModel

class ItemAdapter(
    private val onClick: (ItemModel) -> Unit
) : RecyclerView.Adapter<ItemVH>() {

    private val items = mutableListOf<ItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemVH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row, parent, false)
        return ItemVH(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ItemVH, position: Int) {
        holder.bind(items[position], onClick)
    }

    fun submit(newItems: List<ItemModel>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }
}

package com.example.tddapp.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tddapp.R
import com.example.tddapp.models.ItemModel

class ItemVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val text = itemView.findViewById<TextView>(R.id.itemText)

    fun bind(m: ItemModel, onClick: (ItemModel) -> Unit) {
        text.text = m.text
        itemView.setOnClickListener { onClick(m) }
    }
}

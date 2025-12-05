package com.example.tddapp

import com.example.tddapp.ItemLoader
import com.example.tddapp.models.ItemModel

class ItemLoaderFake : ItemLoader.Callback {

    fun load(count: Int, callback: ItemLoader.Callback) {
        val items = List(count) { i ->
            ItemModel(text = "Item #$i", label = "Label #$i")
        }
        callback.onLoaded(items)
    }

    override fun onLoaded(items: List<ItemModel>) {
        // not used
    }
}

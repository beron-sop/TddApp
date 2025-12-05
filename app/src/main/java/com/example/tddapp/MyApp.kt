package com.example.tddapp

import android.app.Application
import androidx.test.espresso.idling.CountingIdlingResource
import com.example.tddapp.models.ItemModel
import java.util.Timer

class MyApp : Application() {

    lateinit var textProvider: TextProvider
    lateinit var itemLoader: ItemLoader

    override fun onCreate() {
        super.onCreate()

        textProvider = TextProvider(this)

        // Create what ItemLoader requires
        val timer = Timer()
        val idling = CountingIdlingResource("item_loader")

        itemLoader = ItemLoader(timer, idling)
    }
}

package com.example.tddapp

import android.app.Application
import androidx.test.espresso.idling.CountingIdlingResource
import java.util.Timer

class UiTestApplication : Application() {

    lateinit var textProvider: TextProvider
    lateinit var itemLoader: ItemLoader
    lateinit var idling: CountingIdlingResource

    override fun onCreate() {
        super.onCreate()

        textProvider = TextProvider(this)
        idling = CountingIdlingResource("ui_loader")

        // Faster loading for UI tests (100 ms)
        val timer = Timer()
        itemLoader = ItemLoader(timer, idling)
    }
}

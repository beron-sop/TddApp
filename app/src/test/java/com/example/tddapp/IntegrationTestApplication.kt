package com.example.tddapp

import android.app.Application

class IntegrationTestApplication : Application() {
    lateinit var textProvider: TextProvider
    lateinit var itemLoader: ItemLoaderFake

    override fun onCreate() {
        super.onCreate()
        textProvider = TextProvider(this)
        itemLoader = ItemLoaderFake()
    }
}

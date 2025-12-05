package com.example.tddapp

import com.example.tddapp.models.ItemModel
import java.util.*
import androidx.test.espresso.idling.CountingIdlingResource
import com.example.tddapp.utils.SimpleIdlingResource

class ItemLoader(
    private val timer: Timer,
    private val idling: CountingIdlingResource
) {

    interface Callback {
        fun onLoaded(items: List<ItemModel>)
    }

    // Step 10: empty implementation first (will fill in step 12)
    fun load(count: Int, callback: Callback) {
        idling.increment()

        timer.schedule(object : TimerTask() {
            override fun run() {
                // will be implemented in Step 12
                idling.decrement()
            }
        }, 1000)
    }
}

package com.example.tddapp.integration

import android.content.Intent
import android.widget.ListView
import com.example.tddapp.Activity2
import com.example.tddapp.R
import org.junit.Assert.assertEquals
import org.junit.Test
import org.robolectric.Robolectric

class Activity2IntegrationTest {

    @Test
    fun loadsCorrectNumberOfItems() {
        val intent = Intent().apply { putExtra("count", 3) }

        val controller = Robolectric.buildActivity(Activity2::class.java, intent).setup()
        val activity = controller.get()

        val list = activity.findViewById<ListView>(R.id.listView)
        assertEquals(3, list.adapter.count)
    }
}

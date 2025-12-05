package com.example.tddapp.integration

import android.content.Intent
import android.widget.TextView
import org.junit.Assert.assertEquals
import org.junit.Test
import org.robolectric.Robolectric

class Activity3IntegrationTest {

    @Test
    fun displaysCorrectClickedText() {
        val intent = Intent().apply {
            putExtra("clicked", "Item #2")
        }

        val controller = Robolectric.buildActivity(Activity3::class.java, intent).setup()
        val activity = controller.get()

        val result = activity.findViewById<TextView>(R.id.resultText)
        assertEquals("You clicked Item #2", result.text)
    }
}
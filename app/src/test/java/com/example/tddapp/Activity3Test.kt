package com.example.tddapp

import android.content.Intent
import android.widget.TextView
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [34])
class Activity3Test {

    @Test
    fun displaysClickedItem() {
        val intent = Intent(
            ApplicationProvider.getApplicationContext(),
            Activity3::class.java
        ).apply {
            putExtra("clicked", "Item #3")
        }

        val controller = Robolectric.buildActivity(Activity3::class.java, intent).setup()
        val activity = controller.get()

        val textView = activity.findViewById<TextView>(R.id.resultText)

        assertEquals("You clicked Item #3", textView.text)
    }
}

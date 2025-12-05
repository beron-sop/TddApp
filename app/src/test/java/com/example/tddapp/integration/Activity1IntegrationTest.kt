package com.example.tddapp.integration

import android.widget.Button
import android.widget.EditText
import org.junit.Test
import org.junit.Assert.assertEquals
import org.robolectric.Robolectric
import org.robolectric.Shadows

class Activity1IntegrationTest {

    @Test
    fun clickingGoButton_sendsCorrectIntent() {
        val controller = Robolectric.buildActivity(Activity1::class.java).setup()
        val activity = controller.get()

        val edit = activity.findViewById<EditText>(R.id.numberEdit)
        val btn = activity.findViewById<Button>(R.id.goButton)

        edit.setText("5")
        btn.performClick()

        val nextIntent = Shadows.shadowOf(activity).nextStartedActivity
        assertEquals(5, nextIntent.getIntExtra("count", -1))
    }
}

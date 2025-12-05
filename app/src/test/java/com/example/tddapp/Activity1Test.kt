package com.example.tddapp

import android.widget.Button
import android.widget.EditText
import org.junit.Assert
import org.junit.Test
import org.robolectric.Robolectric
import org.robolectric.Shadows

class Activity1Test {

    @Test
    fun clickingGoButton_sendsCorrectIntent() {
        val controller = Robolectric.buildActivity(Activity1::class.java).setup()
        val activity = controller.get()

        val edit = activity.findViewById<EditText>(R.id.numberEdit)
        val btn = activity.findViewById<Button>(R.id.goButton)

        edit.setText("5")
        btn.performClick()

        val next = Shadows.shadowOf(activity).nextStartedActivity
        Assert.assertEquals(5, next.getIntExtra("count", -1))
    }
}

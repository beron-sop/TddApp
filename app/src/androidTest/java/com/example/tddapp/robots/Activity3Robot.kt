package com.example.tddapp.robots

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.tddapp.R

class Activity3Robot {

    fun assertResult(text: String) = apply {
        onView(withId(R.id.resultText)).check(matches(withText(text)))
    }
}

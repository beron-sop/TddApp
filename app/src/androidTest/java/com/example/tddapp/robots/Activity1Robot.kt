package com.example.tddapp.robots

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.tddapp.R

class Activity1Robot {

    fun enterNumber(num: String) = apply {
        onView(withId(R.id.numberEdit)).perform(typeText(num), closeSoftKeyboard())
    }

    fun clickGo() = apply {
        onView(withId(R.id.goButton)).perform(click())
    }
}

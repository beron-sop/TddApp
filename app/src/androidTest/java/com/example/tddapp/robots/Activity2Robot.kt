package com.example.tddapp.robots

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.recyclerview.widget.RecyclerView
import com.example.tddapp.R
import com.example.tddapp.RecyclerViewItemCountAssertion

class Activity2Robot {

    fun assertItemCount(count: Int) = apply {
        onView(withId(R.id.recycler))      // FIXED HERE
            .check(RecyclerViewItemCountAssertion(count))
    }

    fun clickItem(position: Int) = apply {
        onView(withId(R.id.recycler))      // FIXED HERE
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                    position,
                    click()
                )
            )
    }
}

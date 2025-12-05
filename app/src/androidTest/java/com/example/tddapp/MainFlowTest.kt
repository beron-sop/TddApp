package com.example.tddapp

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.tddapp.robots.Activity1Robot
import com.example.tddapp.robots.Activity2Robot
import com.example.tddapp.robots.Activity3Robot
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainFlowTest {

    @get:Rule
    var rule = ActivityScenarioRule(Activity1::class.java)

    @Test
    fun fullFlowTest() {
        val robot1 = Activity1Robot()
        val robot2 = Activity2Robot()
        val robot3 = Activity3Robot()

        robot1.enterNumber("3")
        robot1.clickGo()

        robot2.clickItem(2)

        robot3.assertResult("You clicked Item #3")
    }
}

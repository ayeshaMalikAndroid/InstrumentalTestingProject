package com.example.instrumentalapplication

import android.app.LauncherActivity
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class MainActivityTest1{
    //variable will global for all fun will be created

@get:Rule
val activity = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun checkActivty(){
        onView(withId(R.id.main_act))
            .check(matches(isDisplayed()))
    }

    @Test
    fun checkActivtyNot(){
        onView(withId(R.id.main_act))
            .check(matches(isFocusable()))
    }
    //checking text is visible as we want
    @Test
    fun checkTextVisibility(){
        onView(withId(R.id.cost_of_service))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkButtonVisibility(){
        onView(withId(R.id.calculate_button))
            .check(matches(isDisplayed()))
    }
    @Test
    fun checkButtonClickable(){
        onView(withId(R.id.calculate_button))
            .check(matches(isClickable()))
    }

    //checking if text in our view is the right one
    @Test
    fun testTextIsMain(){
        onView(withId(R.id.cost_of_service))
            .check(matches(withText(R.string.cost_of_service)))
    }
}
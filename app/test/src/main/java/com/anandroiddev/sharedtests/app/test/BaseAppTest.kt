package com.anandroiddev.sharedtests.app.test

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import com.anandroiddev.sharedtests.app.MainActivity
import org.junit.Test

abstract class BaseAppTest {

    @Test
    fun verifyInitialScreenState() {
        // When
        ActivityScenario.launch(MainActivity::class.java)

        // Then
        Espresso.onView(ViewMatchers.withText("0")).check(matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun verifyScreenStateAfterClick() {
        // Given
        ActivityScenario.launch(MainActivity::class.java)

        // When
        Espresso.onView(ViewMatchers.withText("Click me")).perform(ViewActions.click())

        // Then
        Espresso.onView(ViewMatchers.withText("1")).check(matches(ViewMatchers.isDisplayed()))
    }
}

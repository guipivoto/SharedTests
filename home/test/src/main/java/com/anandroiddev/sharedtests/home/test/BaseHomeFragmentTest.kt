package com.anandroiddev.sharedtests.home.test

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.anandroiddev.sharedtests.home.HomeFragment
import com.anandroiddev.sharedtests.home.R
import org.junit.Test

abstract class BaseHomeFragmentTest {

    @Test
    fun verifyInitialScreenState() {
        // When
        launchFragmentInContainer { HomeFragment() }

        // Then
        onView(withId(R.id.click_amount_text)).check(matches(withText("0")))
    }

    @Test
    fun verifyScreenStateAfterClick() {
        // Given
        launchFragmentInContainer { HomeFragment() }

        // When
        onView(withId(R.id.click_me_button)).perform(click())

        // Then
        onView(withId(R.id.click_amount_text)).check(matches(withText("1")))
    }
}

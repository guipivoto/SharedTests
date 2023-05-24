package com.anandroiddev.sharedtests

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.anandroiddev.sharedtests.app.test.BaseAppTest
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [30])
class AppUnitTest : BaseAppTest() {

    @Test
    fun verifyRobolectricSDK() {
        // Just to ensure robolectric is really emulating the desired SDK
        Assert.assertEquals(30, android.os.Build.VERSION.SDK_INT)
    }
}

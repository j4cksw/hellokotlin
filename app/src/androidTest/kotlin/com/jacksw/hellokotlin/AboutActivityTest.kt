package com.jacksw.hellokotlin

import android.support.test.InstrumentationRegistry
import android.support.test.filters.LargeTest
import android.support.test.filters.SmallTest
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppTest {

    @Test
    fun testPackageName() {

        val appContext = InstrumentationRegistry.getTargetContext()

        assertEquals("com.jacksw.hellokotlin", appContext.packageName)
    }
}

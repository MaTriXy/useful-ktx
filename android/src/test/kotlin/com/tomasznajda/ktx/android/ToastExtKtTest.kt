package com.tomasznajda.ktx.android

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowToast

@RunWith(RobolectricTestRunner::class)
class ToastExtKtTest {

    val context = ApplicationProvider.getApplicationContext<Context>()

    @Test
    fun `toast shows toast with string message`() {
        context.toast("toast message")
        assertThat(ShadowToast.getTextOfLatestToast(), equalTo("toast message"))
    }

    @Test
    fun `toast shows toast with message from resources`() {
        context.toast(R.string.test_string_resource)
        assertThat(ShadowToast.getTextOfLatestToast(), equalTo("test string resource"))
    }
}
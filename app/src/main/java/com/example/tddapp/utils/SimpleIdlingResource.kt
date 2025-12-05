package com.example.tddapp.utils

import java.util.concurrent.atomic.AtomicBoolean
import androidx.test.espresso.IdlingResource

class SimpleIdlingResource : IdlingResource {

    @Volatile
    private var callback: IdlingResource.ResourceCallback? = null
    private val isIdleNow = AtomicBoolean(true)

    override fun getName(): String = "SimpleIdlingResource"

    override fun isIdleNow(): Boolean = isIdleNow.get()

    override fun registerIdleTransitionCallback(callback: IdlingResource.ResourceCallback?) {
        this.callback = callback
    }

    fun setIdleState(isIdle: Boolean) {
        isIdleNow.set(isIdle)
        if (isIdle && callback != null) {
            callback!!.onTransitionToIdle()
        }
    }
}
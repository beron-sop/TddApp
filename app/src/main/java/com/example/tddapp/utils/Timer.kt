package com.example.tddapp.utils

class Timer {
    fun delay(ms: Long, block: () -> Unit) {
        Thread {
            Thread.sleep(ms)
            block()
        }.start()
    }
}

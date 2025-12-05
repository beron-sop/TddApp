package com.example.tddapp

import java.util.*

class FakeTimer : Timer() {
    override fun schedule(task: TimerTask, delay: Long) {
        // run immediately for tests
        task.run()
    }
}

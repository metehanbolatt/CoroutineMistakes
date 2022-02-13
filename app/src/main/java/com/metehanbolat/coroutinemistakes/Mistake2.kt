package com.metehanbolat.coroutinemistakes

import kotlinx.coroutines.*
import kotlin.random.Random

suspend fun doSomething() {
    val job = CoroutineScope(Dispatchers.Default).launch {
        var random = Random.nextInt(100_000)
        while (random != 50000 && isActive) {
            random = Random.nextInt(100_000)
            // or we can use "ensureActive() instead of "isActive".
            // ensureActive()
        }
    }
    delay(500L)
    job.cancel()
}
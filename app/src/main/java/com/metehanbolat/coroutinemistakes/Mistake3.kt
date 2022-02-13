package com.metehanbolat.coroutinemistakes

import kotlinx.coroutines.delay
import kotlin.random.Random

suspend fun doNetworkCall(): Result<String> {
    val result = networkCall()
    return if (result == "Success") {
        Result.success(result)
    } else Result.failure(Exception())
}

suspend fun networkCall(): String {
    delay(3000L)
    return if (Random.nextBoolean()) "Success" else "Error"
}
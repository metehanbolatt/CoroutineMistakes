package com.metehanbolat.coroutinemistakes

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlin.random.Random

suspend fun doNetworkCall(): Result<String> {
    val result = networkCall()
    return if (result == "Success") {
        Result.success(result)
    } else Result.failure(Exception())
}

suspend fun networkCall(): String {
    return withContext(Dispatchers.IO) {
        delay(3000L)
        if (Random.nextBoolean()) "Success" else "Error"
    }

}
package com.metehanbolat.coroutinemistakes

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.delay

suspend fun riskyTask() {
    try {
        delay(3000L)
        println("The answer is ${10/0}")
    }catch (e: Exception) {
        if (e is CancellationException){
            throw e
        }
        println("That didn't work")
    }
}
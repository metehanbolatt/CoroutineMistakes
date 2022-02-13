package com.metehanbolat.coroutinemistakes

import kotlinx.coroutines.*

suspend fun getUserFirstNames(userIds: List<String>): List<String> {
    val firstNames = mutableListOf<Deferred<String>>()
    coroutineScope {
        for(id in userIds) {
            val firstName = async {
                getFirstName(id)
            }
            firstNames.add(firstName)
        }
    }
    return firstNames.awaitAll()
}

suspend fun  getFirstName(userId: String): String {
    delay(1000L)
    return "FirstName"
}
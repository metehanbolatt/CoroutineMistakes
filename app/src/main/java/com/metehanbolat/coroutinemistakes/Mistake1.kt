package com.metehanbolat.coroutinemistakes

import kotlinx.coroutines.*

suspend fun getUserFirstNames(userIds: List<String>): List<String> {
    val firstNames = mutableListOf<String>()
    for(id in userIds) {
        firstNames.add(getFirstName(id))
    }
    return firstNames
}

suspend fun  getFirstName(userId: String): String {
    delay(1000L)
    return "FirstName"
}
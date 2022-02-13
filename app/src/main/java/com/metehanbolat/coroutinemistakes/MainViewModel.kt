package com.metehanbolat.coroutinemistakes

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay

class MainViewModel: ViewModel() {

    suspend fun postValueToApi() {
        delay(10000L)
    }

}
package com.metehanbolat.coroutinemistakes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    fun postValueToApi() {
        viewModelScope.launch {
            delay(10000L)
        }
    }

}
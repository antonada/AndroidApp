package com.myniprojects.viruskiller.screens.menu

import androidx.lifecycle.ViewModel
import com.myniprojects.viruskiller.utils.Log

class MenuViewModel: ViewModel() {
    init {
        Log.i("Menu VM init")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("Menu VM cleared")
    }

}
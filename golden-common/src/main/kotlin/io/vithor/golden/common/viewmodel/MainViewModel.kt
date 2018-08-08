package io.vithor.golden.common.viewmodel

import io.vithor.archi.common.CommonViewModel
import io.vithor.archi.common.getPlatform

class MainViewModel : CommonViewModel() {

    val helloText = getPlatform().name

    override fun onCleared() {
        super.onCleared()
    }
}

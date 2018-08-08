package io.vithor.archi.common

import androidx.lifecycle.ViewModel

actual abstract class CommonViewModel : ViewModel() {
    /**
     * This method will be called when this ViewModel is no longer used and will be destroyed.
     *
     *
     * It is useful when ViewModel observes some data and you need to clear this subscription to
     * prevent a leak of this ViewModel.
     */
    actual override fun onCleared() {

    }
}
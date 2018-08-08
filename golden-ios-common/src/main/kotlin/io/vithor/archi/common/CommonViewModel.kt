package io.vithor.archi.common


actual abstract class CommonViewModel {
    /**
     * This method will be called when this ViewModel is no longer used and will be destroyed.
     *
     *
     * It is useful when ViewModel observes some data and you need to clear this subscription to
     * prevent a leak of this ViewModel.
     */
    actual protected open fun onCleared() {

    }
}

package com.example.github.videoapp.base


/**
 * Created on 7/29/17.
 */
interface BaseContract {

    interface View<in T : Presenter> {
        fun setPresenter(presenter: T)
    }

    interface Presenter {
        fun subscribe()

        fun unSubscribe()
    }
}
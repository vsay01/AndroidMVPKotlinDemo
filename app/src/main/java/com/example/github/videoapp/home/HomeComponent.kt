package com.example.github.videoapp.home

import com.example.github.videoapp.scope.FragmentScope
import dagger.Component

/**
 * Created on 7/29/17.
 */
@FragmentScope
@Component(modules = arrayOf(HomeModule::class))
interface HomeComponent {
    fun inject(homeActivity: HomeActivity)
}
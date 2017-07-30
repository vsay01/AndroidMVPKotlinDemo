package com.example.github.videoapp.home

import com.example.github.videoapp.scope.FragmentScope
import dagger.Module
import dagger.Provides

/**
 * Created on 7/29/17.
 */
@Module
class HomeModule(val view: HomeContract.View) {
    @Provides @FragmentScope fun provideHomeContractView() = view
}
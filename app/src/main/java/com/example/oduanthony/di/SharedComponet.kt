package com.example.oduanthony.di

import com.example.oduanthony.screens.filter.FilterFragment
import com.example.oduanthony.BaseApplication
import com.example.oduanthony.MainActivity
import com.example.oduanthony.di.module.NetworkModule
import com.example.oduanthony.di.module.SharedModule
import com.example.oduanthony.screens.carowner.CarOwnerFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [SharedModule::class, NetworkModule::class])
interface SharedComponent {

    fun inject(application: BaseApplication)
    fun inject(application: MainActivity)
    fun inject(fragment: FilterFragment)
    fun inject(fragment: CarOwnerFragment)

}
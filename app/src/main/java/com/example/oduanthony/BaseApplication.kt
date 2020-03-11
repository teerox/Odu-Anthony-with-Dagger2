package com.example.oduanthony

import android.app.Application
import com.example.oduanthony.di.DaggerSharedComponent
import com.example.oduanthony.di.SharedComponent
import com.example.oduanthony.di.module.NetworkModule
import com.example.oduanthony.di.module.SharedModule

class BaseApplication : Application() {

    lateinit var component: SharedComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerSharedComponent.builder()
            .networkModule(NetworkModule(this))
            .build()
    }

    fun getSharedComponent(): SharedComponent {
        return component
    }
}
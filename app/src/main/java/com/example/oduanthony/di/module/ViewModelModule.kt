package com.example.oduanthony.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.oduanthony.screens.carowner.CarOwnerViewModel
import com.example.oduanthony.screens.filter.FilterViewModel
import com.example.oduanthony.screens.filter.ViewModelFactory
import com.example.oduanthony.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(CarOwnerViewModel::class)
    abstract fun bindViewModule(carOwnerViewModel: CarOwnerViewModel):ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(FilterViewModel::class)
    abstract fun bindFilterViewModule(filterViewModel: FilterViewModel):ViewModel

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

}
package com.example.oduanthony.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/example/oduanthony/di/module/ViewModelModule;", "", "()V", "bindFilterViewModule", "Landroidx/lifecycle/ViewModel;", "filterViewModel", "Lcom/example/oduanthony/screens/filter/FilterViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "Lcom/example/oduanthony/screens/filter/ViewModelFactory;", "bindViewModule", "carOwnerViewModel", "Lcom/example/oduanthony/screens/carowner/CarOwnerViewModel;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.example.oduanthony.di.ViewModelKey(value = com.example.oduanthony.screens.carowner.CarOwnerViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindViewModule(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.screens.carowner.CarOwnerViewModel carOwnerViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.example.oduanthony.di.ViewModelKey(value = com.example.oduanthony.screens.filter.FilterViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindFilterViewModule(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.screens.filter.FilterViewModel filterViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.screens.filter.ViewModelFactory viewModelFactory);
    
    public ViewModelModule() {
        super();
    }
}
package com.example.oduanthony.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/example/oduanthony/di/SharedComponent;", "", "inject", "", "application", "Lcom/example/oduanthony/BaseApplication;", "Lcom/example/oduanthony/MainActivity;", "fragment", "Lcom/example/oduanthony/screens/carowner/CarOwnerFragment;", "Lcom/example/oduanthony/screens/filter/FilterFragment;", "app_debug"})
@dagger.Component(modules = {com.example.oduanthony.di.module.SharedModule.class, com.example.oduanthony.di.module.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface SharedComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.BaseApplication application);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.MainActivity application);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.screens.filter.FilterFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.screens.carowner.CarOwnerFragment fragment);
}
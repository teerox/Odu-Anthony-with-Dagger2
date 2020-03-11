package com.example.oduanthony.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/oduanthony/di/module/SharedModule;", "", "application", "Lcom/example/oduanthony/BaseApplication;", "(Lcom/example/oduanthony/BaseApplication;)V", "sharedPerf", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class SharedModule {
    private final com.example.oduanthony.BaseApplication application = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences sharedPerf(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public SharedModule(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.BaseApplication application) {
        super();
    }
}
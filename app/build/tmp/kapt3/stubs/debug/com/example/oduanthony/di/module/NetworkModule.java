package com.example.oduanthony.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001\u00a2\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\fH\u0001\u00a2\u0006\u0002\b\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/oduanthony/di/module/NetworkModule;", "", "application", "Lcom/example/oduanthony/BaseApplication;", "(Lcom/example/oduanthony/BaseApplication;)V", "BASE_URL", "", "context", "Landroid/content/Context;", "provideBalanceService", "Lcom/example/oduanthony/service/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideBalanceService$app_debug", "provideRetrofit", "provideRetrofit$app_debug", "app_debug"})
@dagger.Module(includes = {com.example.oduanthony.di.module.ViewModelModule.class})
public final class NetworkModule {
    private final java.lang.String BASE_URL = "https://android-json-test-api.herokuapp.com/";
    private final com.example.oduanthony.BaseApplication application = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context context() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.oduanthony.service.ApiService provideBalanceService$app_debug(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public NetworkModule(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.BaseApplication application) {
        super();
    }
}
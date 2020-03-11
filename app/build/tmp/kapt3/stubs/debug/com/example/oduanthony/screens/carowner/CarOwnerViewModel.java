package com.example.oduanthony.screens.carowner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\f\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/example/oduanthony/screens/carowner/CarOwnerViewModel;", "Landroidx/lifecycle/ViewModel;", "carOwnerRepo", "Lcom/example/oduanthony/repository/FilterRepo;", "(Lcom/example/oduanthony/repository/FilterRepo;)V", "_isDbAvailable", "Landroidx/lifecycle/MutableLiveData;", "", "absoluteFile", "Ljava/io/File;", "getAbsoluteFile", "()Ljava/io/File;", "absoluteFile$delegate", "Lkotlin/Lazy;", "getCarOwnerRepo", "()Lcom/example/oduanthony/repository/FilterRepo;", "setCarOwnerRepo", "filterResult", "Ljava/util/ArrayList;", "Lcom/example/oduanthony/model/CarOwner;", "isDbAvailable", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "filterFile", "Lcom/example/oduanthony/model/CarOwnerList;", "data", "Lcom/example/oduanthony/model/Filter;", "(Lcom/example/oduanthony/model/Filter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFile", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CarOwnerViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.CompletableJob viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private final kotlin.Lazy absoluteFile$delegate = null;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.oduanthony.model.CarOwner>> filterResult;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isDbAvailable;
    @org.jetbrains.annotations.NotNull()
    private com.example.oduanthony.repository.FilterRepo carOwnerRepo;
    
    private final java.io.File getAbsoluteFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isDbAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object filterFile(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.model.Filter data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.example.oduanthony.model.CarOwner>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.oduanthony.repository.FilterRepo getCarOwnerRepo() {
        return null;
    }
    
    public final void setCarOwnerRepo(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.repository.FilterRepo p0) {
    }
    
    @javax.inject.Inject()
    public CarOwnerViewModel(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.repository.FilterRepo carOwnerRepo) {
        super();
    }
}
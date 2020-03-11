package com.example.oduanthony.screens.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0012J\u0018\u0010#\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020%0$j\u0002`&\u0018\u00010\bJ\u0006\u0010\'\u001a\u00020!J\b\u0010(\u001a\u00020)H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0018\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014\u00a8\u0006*"}, d2 = {"Lcom/example/oduanthony/screens/filter/FilterViewModel;", "Landroidx/lifecycle/ViewModel;", "filterRepository", "Lcom/example/oduanthony/repository/FilterRepo;", "dialog", "Lcom/example/oduanthony/DownloadProgress;", "(Lcom/example/oduanthony/repository/FilterRepo;Lcom/example/oduanthony/DownloadProgress;)V", "_completeDownload", "Landroidx/lifecycle/MutableLiveData;", "", "_startDialogDownload", "absoluteFile", "Ljava/io/File;", "getAbsoluteFile", "()Ljava/io/File;", "absoluteFile$delegate", "Lkotlin/Lazy;", "completeDownload", "Landroidx/lifecycle/LiveData;", "getCompleteDownload", "()Landroidx/lifecycle/LiveData;", "errorDisplay", "", "file", "getFile", "file$delegate", "grantAccess", "getGrantAccess", "()Landroidx/lifecycle/MutableLiveData;", "isLoading", "startDialogDownload", "getStartDialogDownload", "checkDataExist", "", "dismiss", "loadData", "Ljava/util/ArrayList;", "Lcom/example/oduanthony/model/Filter;", "Lcom/example/oduanthony/model/FilterArray;", "showDialog", "startDownload", "", "app_debug"})
public final class FilterViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorDisplay = null;
    private final kotlin.Lazy file$delegate = null;
    private final kotlin.Lazy absoluteFile$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _startDialogDownload = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _completeDownload = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> grantAccess = null;
    private final com.example.oduanthony.repository.FilterRepo filterRepository = null;
    private final com.example.oduanthony.DownloadProgress dialog = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> errorDisplay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.oduanthony.model.Filter>> loadData() {
        return null;
    }
    
    private final java.io.File getFile() {
        return null;
    }
    
    private final java.io.File getAbsoluteFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getStartDialogDownload() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getCompleteDownload() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGrantAccess() {
        return null;
    }
    
    public final void checkDataExist() {
    }
    
    private final int startDownload() {
        return 0;
    }
    
    public final void showDialog() {
    }
    
    public final void dismiss() {
    }
    
    @javax.inject.Inject()
    public FilterViewModel(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.repository.FilterRepo filterRepository, @org.jetbrains.annotations.NotNull()
    com.example.oduanthony.DownloadProgress dialog) {
        super();
    }
}
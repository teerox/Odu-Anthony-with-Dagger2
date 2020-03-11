package com.example.oduanthony.screens.carowner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u00060"}, d2 = {"Lcom/example/oduanthony/screens/carowner/CarOwnerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/oduanthony/screens/carowner/CarOwnerAdapter;", "getAdapter", "()Lcom/example/oduanthony/screens/carowner/CarOwnerAdapter;", "setAdapter", "(Lcom/example/oduanthony/screens/carowner/CarOwnerAdapter;)V", "arrayUser", "Ljava/util/ArrayList;", "Lcom/example/oduanthony/model/CarOwner;", "getArrayUser", "()Ljava/util/ArrayList;", "setArrayUser", "(Ljava/util/ArrayList;)V", "binding", "Lcom/example/oduanthony/databinding/FragmentCarOwnerBinding;", "getBinding", "()Lcom/example/oduanthony/databinding/FragmentCarOwnerBinding;", "setBinding", "(Lcom/example/oduanthony/databinding/FragmentCarOwnerBinding;)V", "carOwnerViewModel", "Lcom/example/oduanthony/screens/carowner/CarOwnerViewModel;", "getCarOwnerViewModel", "()Lcom/example/oduanthony/screens/carowner/CarOwnerViewModel;", "setCarOwnerViewModel", "(Lcom/example/oduanthony/screens/carowner/CarOwnerViewModel;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class CarOwnerFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.example.oduanthony.databinding.FragmentCarOwnerBinding binding;
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.NotNull()
    public com.example.oduanthony.screens.carowner.CarOwnerAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.oduanthony.model.CarOwner> arrayUser;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public com.example.oduanthony.screens.carowner.CarOwnerViewModel carOwnerViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.oduanthony.databinding.FragmentCarOwnerBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.databinding.FragmentCarOwnerBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return null;
    }
    
    public final void setRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.oduanthony.screens.carowner.CarOwnerAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.screens.carowner.CarOwnerAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.oduanthony.model.CarOwner> getArrayUser() {
        return null;
    }
    
    public final void setArrayUser(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.oduanthony.model.CarOwner> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.oduanthony.screens.carowner.CarOwnerViewModel getCarOwnerViewModel() {
        return null;
    }
    
    public final void setCarOwnerViewModel(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.screens.carowner.CarOwnerViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public CarOwnerFragment() {
        super();
    }
}
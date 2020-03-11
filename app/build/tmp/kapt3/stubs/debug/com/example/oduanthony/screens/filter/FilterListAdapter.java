package com.example.oduanthony.screens.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BB\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\n\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016R)\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\""}, d2 = {"Lcom/example/oduanthony/screens/filter/FilterListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/oduanthony/screens/filter/FilterListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "myArrayList", "Ljava/util/ArrayList;", "Lcom/example/oduanthony/model/Filter;", "Lcom/example/oduanthony/model/FilterArray;", "clickListerner", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "", "(Landroid/content/Context;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getMyArrayList", "()Ljava/util/ArrayList;", "setMyArrayList", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class FilterListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.oduanthony.screens.filter.FilterListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.oduanthony.model.Filter> myArrayList;
    private final kotlin.jvm.functions.Function1<com.example.oduanthony.model.Filter, kotlin.Unit> clickListerner = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.oduanthony.screens.filter.FilterListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.oduanthony.screens.filter.FilterListAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.oduanthony.model.Filter> getMyArrayList() {
        return null;
    }
    
    public final void setMyArrayList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.oduanthony.model.Filter> p0) {
    }
    
    public FilterListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.oduanthony.model.Filter> myArrayList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.oduanthony.model.Filter, kotlin.Unit> clickListerner) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\t0\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/example/oduanthony/screens/filter/FilterListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/oduanthony/databinding/FilterListItemBinding;", "(Lcom/example/oduanthony/databinding/FilterListItemBinding;)V", "getBinding", "()Lcom/example/oduanthony/databinding/FilterListItemBinding;", "setBinding", "bind", "", "item", "Lcom/example/oduanthony/model/Filter;", "clickListerner", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.oduanthony.databinding.FilterListItemBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.oduanthony.model.Filter item, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.oduanthony.model.Filter, kotlin.Unit> clickListerner) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.oduanthony.databinding.FilterListItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.oduanthony.databinding.FilterListItemBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.oduanthony.databinding.FilterListItemBinding binding) {
            super(null);
        }
    }
}
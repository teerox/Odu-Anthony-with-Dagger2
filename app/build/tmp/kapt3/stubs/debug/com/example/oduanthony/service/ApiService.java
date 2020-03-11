package com.example.oduanthony.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/oduanthony/service/ApiService;", "", "getAllFilterAsync", "Lretrofit2/Call;", "Ljava/util/ArrayList;", "Lcom/example/oduanthony/model/Filter;", "Lcom/example/oduanthony/model/FilterArray;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "accounts")
    public abstract retrofit2.Call<java.util.ArrayList<com.example.oduanthony.model.Filter>> getAllFilterAsync();
}
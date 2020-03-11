package com.example.oduanthony.repository

import com.example.oduanthony.model.Filter
import com.example.oduanthony.model.FilterArray
import com.example.oduanthony.service.ApiService
import io.reactivex.Single
import retrofit2.Call
import javax.inject.Inject

class FilterRepo @Inject constructor(private val apiService: ApiService){

    fun getFilterRepo(): Call<FilterArray>{
        return apiService.getAllFilterAsync()
    }
}


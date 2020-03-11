package com.example.oduanthony.service


import com.example.oduanthony.model.FilterArray
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET


interface ApiService {

    @GET("accounts")
    fun getAllFilterAsync(): Call<FilterArray>
}
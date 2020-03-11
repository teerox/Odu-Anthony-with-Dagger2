package com.example.oduanthony.di.module

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import com.example.oduanthony.BaseApplication
import com.example.oduanthony.service.ApiService
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class])
class NetworkModule(private val application: BaseApplication) {
    @Provides
    fun context(): Context {
        return application
    }


    private val BASE_URL = "https://android-json-test-api.herokuapp.com/"


    @Singleton
    @Provides
    internal fun provideRetrofit(): Retrofit {
//        val cacheSize = (5 * 1024 * 1024).toLong()
//        val myCache = Cache(context().cacheDir, cacheSize)
//        val httpClient = OkHttpClient.Builder()
           // .cache(myCache).build()
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            //.client(httpClient)
            .build()
    }

    @Singleton
    @Provides
    internal fun provideBalanceService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }


}
package com.example.recyclerview.hilt

import com.example.recyclerview.remote.retrofit.BASE_URL
import com.example.recyclerview.remote.retrofit.NumberApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object NumberModule {

    @Provides
    fun provideRetrofitInterface() : NumberApi{
        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
            .create(NumberApi::class.java)
    }

}
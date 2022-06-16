package com.example.recyclerview.remote.retrofit

import retrofit2.http.GET
import retrofit2.http.Path

const val BASE_URL = "https://numbersapi.com/"

interface NumberApi {

    @GET("/{number}")
    suspend fun getNumberFact(
        @Path("number") number : Int
    )

}
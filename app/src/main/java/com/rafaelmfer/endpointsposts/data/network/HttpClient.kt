package com.rafaelmfer.endpointsposts.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object HttpClient{

    private val BASE_URL = "https://jsonplaceholder.typicode.com"

    val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()
}
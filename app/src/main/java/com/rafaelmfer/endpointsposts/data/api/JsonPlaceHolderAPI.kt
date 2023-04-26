package com.rafaelmfer.endpointsposts.data.api

import com.rafaelmfer.endpointsposts.data.remote.response.PostResponse
import retrofit2.http.GET

interface JsonPlaceHolderAPI {

    @GET("/posts")
    suspend fun getAllPosts(): List<PostResponse>
}
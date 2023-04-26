package com.rafaelmfer.endpointsposts.data.repository

import com.rafaelmfer.endpointsposts.data.api.JsonPlaceHolderAPI
import com.rafaelmfer.endpointsposts.data.network.HttpClient
import com.rafaelmfer.endpointsposts.data.remote.response.PostResponse
import com.rafaelmfer.endpointsposts.domain.repository.IRepository

class Repository : IRepository {

    private val api = HttpClient.retrofit.create(JsonPlaceHolderAPI::class.java)

    override suspend fun getAllPosts(): List<PostResponse> {
        return api.getAllPosts()
    }
}
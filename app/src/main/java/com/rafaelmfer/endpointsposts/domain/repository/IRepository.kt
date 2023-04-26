package com.rafaelmfer.endpointsposts.domain.repository

import com.rafaelmfer.endpointsposts.data.remote.response.PostResponse

interface IRepository {

    suspend fun getAllPosts(): List<PostResponse>
}
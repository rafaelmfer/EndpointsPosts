package com.rafaelmfer.endpointsposts.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rafaelmfer.endpointsposts.data.remote.response.PostResponse
import com.rafaelmfer.endpointsposts.data.repository.Repository
import kotlinx.coroutines.launch

class PostsViewModel : ViewModel() {

    private val repository = Repository()

    private val resultadoMutableLiveData: MutableLiveData<List<PostResponse>> = MutableLiveData()

    val resultadoLiveData: LiveData<List<PostResponse>> = resultadoMutableLiveData

    fun getAllPosts() {
        viewModelScope.launch {
            val resultado = repository.getAllPosts()
            resultadoMutableLiveData.postValue(resultado)
        }
    }
}
package com.rafaelmfer.endpointsposts.presentation.activities

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.rafaelmfer.endpointsposts.R
import com.rafaelmfer.endpointsposts.databinding.ActivityMainBinding
import com.rafaelmfer.endpointsposts.databinding.ActivityPostsListBinding
import com.rafaelmfer.endpointsposts.presentation.viewmodel.PostsViewModel

class ListPostsActivity : AppCompatActivity() {


    private var _binding : ActivityPostsListBinding? = null
    private val binding get() = _binding!!

    private val viewModel : PostsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityPostsListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.resultadoLiveData.observe(this@ListPostsActivity){
            binding.rvPosts.adapter = PostsAdapter(it)
        }
        viewModel.getAllPosts()
    }
}
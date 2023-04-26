package com.rafaelmfer.endpointsposts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rafaelmfer.endpointsposts.databinding.ActivityMainBinding
import com.rafaelmfer.endpointsposts.presentation.activities.ListPostsActivity

class MainActivity : AppCompatActivity() {

    var _binding : ActivityMainBinding? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        var root = binding.root
        setContentView(root)

        binding.mbtEndpointPosts.setOnClickListener {
            val intent = Intent(applicationContext, ListPostsActivity::class.java)
            startActivity(intent)
        }

    }
}
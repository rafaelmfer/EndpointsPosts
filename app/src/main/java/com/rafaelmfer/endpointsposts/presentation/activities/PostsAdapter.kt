package com.rafaelmfer.endpointsposts.presentation.activities

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rafaelmfer.endpointsposts.data.remote.response.PostResponse
import com.rafaelmfer.endpointsposts.databinding.ItemPostBinding

class PostsAdapter(private var list: List<PostResponse>) : RecyclerView.Adapter<PostsAdapter.PostsViewHolder>() {

//    var dataSet: MutableList<PostsResponse>? = null //nulo-exige verificação a cada vez q for usar
//    var dataSet: MutableList<PostResponse> = mutableListOf() //vazio

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsAdapter.PostsViewHolder {
        val binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostsAdapter.PostsViewHolder, position: Int) {
        val postagem = list[position]
        holder.bind(postagem)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PostsViewHolder(private val binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: PostResponse) {
            binding.tvPostsItemUserId.text = item.userId.toString()
            binding.tvPostsItemId.text = item.id.toString()
            binding.tvPostsItemTitle.text = item.title
            binding.tvPostsItemBody.text = item.body
        }
    }
}
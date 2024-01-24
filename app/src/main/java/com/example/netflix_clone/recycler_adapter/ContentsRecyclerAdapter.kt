package com.example.netflix_clone.recycler_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_clone.data.ContentsData
import com.example.netflix_clone.databinding.HomeFragmentItemBinding

class ContentsRecyclerAdapter(private var list : MutableList<String>) :
    RecyclerView.Adapter<ContentsRecyclerAdapter.Holder>() {

    inner class Holder(private val binding: HomeFragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        var themeText = binding.txTheme


        fun bind(str: String) {
            themeText.text = str
            binding.recyclerView.adapter = ContentsRecyclerAdapter2(ContentsData.list)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = HomeFragmentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        list[position].run { holder.bind(this)}
    }
}
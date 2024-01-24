package com.example.netflix_clone.recycler_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_clone.databinding.ContentsItemBinding
import com.example.netflix_clone.databinding.HomeFragmentItemBinding

class ContentsRecyclerAdapter2(private var list : MutableList<String>) :
    RecyclerView.Adapter<ContentsRecyclerAdapter2.Holder>() {

    inner class Holder(binding: ContentsItemBinding) : RecyclerView.ViewHolder(binding.root) {


        fun bind(str: String) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ContentsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        list[position].run { holder.bind(this)}
    }
}
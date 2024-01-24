package com.example.netflix_clone.recycler_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix_clone.data.ContentsData
import com.example.netflix_clone.data.ContentsDataList
import com.example.netflix_clone.databinding.HomeFragmentItemBinding

class ContentsRecyclerAdapter(private var list : MutableList<ContentsData>) :
    RecyclerView.Adapter<ContentsRecyclerAdapter.Holder>() {

    inner class Holder(private val binding: HomeFragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        var themeText = binding.txTheme


        fun bind(item: ContentsData) {
            themeText.text = item.str
            binding.recyclerView.adapter = ContentsRecyclerAdapter2(ContentsDataList.list)
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
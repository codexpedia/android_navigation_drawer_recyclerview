package com.example.androidnavigationdrawerrecyclerview.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.androidnavigationdrawerrecyclerview.data.DrawerItem
import com.example.androidnavigationdrawerrecyclerview.R
import kotlinx.android.synthetic.main.nav_drawer_row.view.*

class DrawerAdapter(private val data: List<DrawerItem>) : RecyclerView.Adapter<DrawerAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.nav_drawer_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val current = data[position]
        holder.title.text = current.title
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.tv_title
        init {
        }
    }
}

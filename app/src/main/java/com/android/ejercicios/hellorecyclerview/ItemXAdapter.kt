package com.android.ejercicios.hellorecyclerview

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ItemXAdapter(private val dataSet: List<ItemX>) : RecyclerView.Adapter<ItemXAdapter.ItemXViewHolder>() {

  class ItemXViewHolder(var view: View) : RecyclerView.ViewHolder(view)

  override fun onCreateViewHolder(parent: ViewGroup,
                                  viewType: Int): ItemXAdapter.ItemXViewHolder {
    val v = LayoutInflater.from(parent.context)
        .inflate(R.layout.item_x_view, parent, false)

    return ItemXViewHolder(v)
  }

  override fun onBindViewHolder(holder: ItemXViewHolder, position: Int) {
    val image = holder.view.findViewById<ImageView>(R.id.image)
    val title = holder.view.findViewById<TextView>(R.id.title)
    val subTitle = holder.view.findViewById<TextView>(R.id.subTitle)

    val itemX = dataSet[position]

    image.setImageResource(itemX.image)
    title.text = itemX.title
    subTitle.text = itemX.subTitle

    holder.view.setOnClickListener { Log.e("**", "click $position") }
  }

  override fun getItemCount(): Int {
    return dataSet.size
  }
}
package com.example.wedigitapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wedigitapp.R
import com.example.wedigitapp.models.ProfileData

open class JamesItemAdapter(
    private val context: Context,
    private var list: ArrayList<ProfileData>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MyViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.james_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val model = list[position]

        var imageView = holder.itemView.findViewById<ImageView>(R.id.imageView)
        val textView = holder.itemView.findViewById<TextView>(R.id.textView)

        if (holder is MyViewHolder) {
            imageView.setImageResource(model.imageId)
            textView.text = model.viewTitle
        }
    }

    private class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)
}
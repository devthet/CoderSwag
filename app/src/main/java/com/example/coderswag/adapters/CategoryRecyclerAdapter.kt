package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.model.Category
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecyclerAdapter(var context: Context,var categories: List<Category>): RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    inner  class Holder (itemView:View?): RecyclerView.ViewHolder(itemView!!){
        var categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        var categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory( context: Context,category:Category){
            val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false)
        return  Holder(view)
    }

    override fun getItemCount(): Int {
       return  categories.count()
    }


    override fun onBindViewHolder(holder: Holder, position: Int) {
       holder.bindCategory(context,categories[position])
    }
}
package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R
import com.example.coderswag.model.Category

class CategoryAdapter(var context:Context,var categories: List<Category>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var categoryView : View
        var holder: HolderView
        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = HolderView()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            println("I exist for the first time")
            categoryView.tag = holder
        }else {
            holder = convertView.tag as HolderView
            categoryView = convertView
            println("Go Green ,Recycle!")
        }



        val resourceid = context.resources.getIdentifier(categories[position].image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceid)

        holder.categoryName?.text = categories[position].title
        return  categoryView
    }

    override fun getItem(position: Int): Any {
        return  categories[position]
    }

    override fun getItemId(position: Int): Long {
        return  0
    }

    override fun getCount(): Int {
        return  categories.count()
    }

    private  class  HolderView{
        var categoryImage : ImageView? = null
        var categoryName: TextView? = null
    }
}
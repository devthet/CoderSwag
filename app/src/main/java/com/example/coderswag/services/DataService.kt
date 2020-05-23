package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("Digital","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("Digital","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("Digital","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("Digital","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("Digital","digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslope graphic Beanie","$18","hat1"),
        Product("Devslope Hat Black","$20","hat2"),
        Product("Devslope Hat White","$18","hat3"),
        Product("Devslope Hat Snapback","$18","hat4"),
        Product("Devslope graphic Beanie","$18","hat1"),
        Product("Devslope Hat Black","$20","hat2"),
        Product("Devslope Hat White","$18","hat3"),
        Product("Devslope Hat Snapback","$18","hat4")

    )
    val hoodies = listOf(
    Product("Devslope Hoodie Gray","$28","hoodie1"),
    Product("Devslope Hoodie Black","$20","hoodie2"),
    Product("Devslope Hoodie White","$18","hoodie3"),
    Product("Devslope Hoodie Snapback","$18","hoodie4"),
        Product("Devslope Hoodie Gray","$28","hoodie1"),
        Product("Devslope Hoodie Black","$20","hoodie2"),
        Product("Devslope Hoodie White","$18","hoodie3"),
        Product("Devslope Hoodie Snapback","$18","hoodie4")

    )
    val shirts = listOf(
        Product("Devslope Shirt Gray","$28","shirt1"),
        Product("Devslope Shirt Black","$20","shirt2"),
        Product("Devslope Shirt White","$18","shirt3"),
        Product("Devslope Shirt Snapback","$18","shirt4"),
        Product("Kickflip Shirt ","$18","shirt5"),
        Product("Devslope Shirt Gray","$28","shirt1"),
        Product("Devslope Shirt Black","$20","shirt2"),
        Product("Devslope Shirt White","$18","shirt3"),
        Product("Devslope Shirt Snapback","$18","shirt4"),
        Product("Kickflip Shirt ","$18","shirt5")

    )
    val dititalGood = listOf<Product>()

    fun getProducts(category:String): List<Product>{
        return  when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> dititalGood
        }


    }
}
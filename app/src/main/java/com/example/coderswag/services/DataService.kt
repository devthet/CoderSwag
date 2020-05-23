package com.example.coderswag.services

import com.example.coderswag.model.Category
import com.example.coderswag.model.Product

object DataService {
    var categories = listOf(
        Category("Shirts","shirtimage"),
        Category("Hoodies","hoodieimage"),
        Category("Hats","hatimage"),
        Category("Digital","digitalgoodsimage"),
        Category("Shirts","shirtimage"),
        Category("Hoodies","hoodieimage"),
        Category("Hats","hatimage"),
        Category("Digital","digitalgoodsimage"),
        Category("Shirts","shirtimage"),
        Category("Hoodies","hoodieimage"),
        Category("Hats","hatimage"),
        Category("Digital","digitalgoodsimage"),
        Category("Shirts","shirtimage"),
        Category("Hoodies","hoodieimage"),
        Category("Hats","hatimage"),
        Category("Digital","digitalgoodsimage"),
        Category("Shirts","shirtimage"),
        Category("Hoodies","hoodieimage"),
        Category("Hats","hatimage"),
        Category("Digital","digitalgoodsimage")

    )

    var hats = listOf(
        Product("Devslope graphic Beanie","$18","hat1"),
        Product("Devslope Hat Black","$20","hat2"),
        Product("Devslope Hat White","$18","hat3"),
        Product("Devslope Hat Snapback","$18","hat4")

    )
    var hoodies = listOf(
    Product("Devslope Hoodie Gray","$28","hoodie1"),
    Product("Devslope Hoodie Black","$20","hoodie2"),
    Product("Devslope Hoodie White","$18","hoodie3"),
    Product("Devslope Hoodie Snapback","$18","hoodie4")

    )
    var shirts = listOf(
        Product("Devslope Shirt Gray","$28","shirt1"),
        Product("Devslope Shirt Black","$20","shirt2"),
        Product("Devslope Shirt White","$18","shirt3"),
        Product("Devslope Shirt Snapback","$18","shirt4"),
        Product("Kickflip Shirt ","$18","shirt5")

    )
}
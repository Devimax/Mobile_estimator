package com.example.mobileestimator.domain

data class MaterialItem(

    val category: String,
    val name: String,
    val count: Float,
    val price: Float,
    var id: Int = -1
)

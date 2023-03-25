package com.example.mobileestimator.domain

interface MaterialListRepository {

    fun addMaterialItem(materialItem: MaterialItem)

    fun deleteMaterialItem(materialItem: MaterialItem)

    fun editMaterialItem(materialItem: MaterialItem)

    fun getMaterialItem(materialItemId: Int): MaterialItem

    fun getMaterialList(): List<MaterialItem>
}
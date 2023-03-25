package com.example.mobileestimator.data

import com.example.mobileestimator.domain.MaterialItem
import com.example.mobileestimator.domain.MaterialListRepository

object MaterialListRepositoryImpl: MaterialListRepository {

    private val materialList = mutableListOf<MaterialItem>()

    override fun addMaterialItem(materialItem: MaterialItem) {
        materialList.add(materialItem)
    }

    override fun deleteMaterialItem(materialItem: MaterialItem) {
        materialList.remove(materialItem)
    }

    override fun editMaterialItem(materialItem: MaterialItem) {
        val oldMaterial = getMaterialItem(materialItem.id)
        materialList.remove(oldMaterial)
        addMaterialItem(materialItem)
    }

    override fun getMaterialItem(materialItemId: Int): MaterialItem {
        return materialList.find {
            it.id == materialItemId
        } ?: throw java.lang.RuntimeException("Material with id $materialItemId not found")
        }

    override fun getMaterialList(): List<MaterialItem> {
        return materialList.toList()
    }
}
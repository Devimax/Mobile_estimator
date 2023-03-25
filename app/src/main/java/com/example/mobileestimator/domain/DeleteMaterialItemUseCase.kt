package com.example.mobileestimator.domain

class DeleteMaterialItemUseCase(private val materialListRepository: MaterialListRepository) {

    fun deleteMaterialItem(materialItem: MaterialItem) {
        materialListRepository.deleteMaterialItem(materialItem)

    }
}
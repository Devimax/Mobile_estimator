package com.example.mobileestimator.domain

class AddMaterialItemUseCase(private val materialListRepository: MaterialListRepository) {

    fun addMaterialItem(materialItem: MaterialItem) {
        materialListRepository.addMaterialItem(materialItem)
    }
}
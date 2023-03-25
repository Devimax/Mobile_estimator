package com.example.mobileestimator.domain

class EditMaterialItemUseCase(private val materialListRepository: MaterialListRepository) {

    fun editMaterialItem(materialItem: MaterialItem) {
        materialListRepository.editMaterialItem(materialItem)

    }
}
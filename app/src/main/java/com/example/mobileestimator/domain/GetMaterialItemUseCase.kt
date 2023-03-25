package com.example.mobileestimator.domain

class GetMaterialItemUseCase(private val materialListRepository: MaterialListRepository) {

    fun getMaterialItem(materialItemId: Int): MaterialItem {
        return materialListRepository.getMaterialItem(materialItemId)
    }
}
package com.example.mobileestimator.domain

class GetMaterialListUseCase(private val materialListRepository: MaterialListRepository) {

    fun getMaterialList(): List<MaterialItem> {
        return materialListRepository.getMaterialList()
    }
}
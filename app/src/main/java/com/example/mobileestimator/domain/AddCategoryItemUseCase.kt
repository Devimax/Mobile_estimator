package com.example.mobileestimator.domain

class AddCategoryItemUseCase(private val categoryListRepository: CategoryListRepository) {

    fun addCategoryItem(categoryItem: CategoryItem) {
        categoryListRepository.addCategoryItem(categoryItem)
    }
}
package com.example.mobileestimator.domain

class EditCategoryItemUseCase(private val categoryListRepository: CategoryListRepository) {

    fun editCategoryItem(categoryItem: CategoryItem) {
        categoryListRepository.editCategoryItem(categoryItem)

    }
}
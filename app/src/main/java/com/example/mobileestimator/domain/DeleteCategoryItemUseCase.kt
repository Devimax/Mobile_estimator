package com.example.mobileestimator.domain

class DeleteCategoryItemUseCase (private val categoryListRepository: CategoryListRepository) {

    fun deleteCategoryItem(categoryItem: CategoryItem) {
        categoryListRepository.deleteCategoryItem(categoryItem)

    }
}
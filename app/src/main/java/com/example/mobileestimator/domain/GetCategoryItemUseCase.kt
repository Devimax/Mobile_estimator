package com.example.mobileestimator.domain

class GetCategoryItemUseCase(private val categoryListRepository: CategoryListRepository) {

    fun getCategoryItem(categoryItemId: Int): CategoryItem {
        return categoryListRepository.getCategoryItem(categoryItemId)

    }
}
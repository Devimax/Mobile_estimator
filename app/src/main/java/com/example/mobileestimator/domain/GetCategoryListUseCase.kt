package com.example.mobileestimator.domain

class GetCategoryListUseCase(private val categoryListRepository: CategoryListRepository) {

    fun getCategoryList(): List<CategoryItem> {
        return categoryListRepository.getCategoryList()
    }
}
package com.example.mobileestimator.domain

interface CategoryListRepository {

    fun addCategoryItem(categoryItem: CategoryItem)

    fun deleteCategoryItem(categoryItem: CategoryItem)

    fun editCategoryItem(categoryItem: CategoryItem)

    fun getCategoryItem(categoryItemId: Int): CategoryItem

    fun getCategoryList(): List<CategoryItem>
}
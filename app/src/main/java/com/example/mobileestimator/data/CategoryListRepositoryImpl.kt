package com.example.mobileestimator.data

import com.example.mobileestimator.domain.CategoryItem
import com.example.mobileestimator.domain.CategoryListRepository

object CategoryListRepositoryImpl: CategoryListRepository {

    private val categoryList = mutableListOf<CategoryItem>()

    override fun addCategoryItem(categoryItem: CategoryItem) {
        categoryList.add(categoryItem)
    }

    override fun deleteCategoryItem(categoryItem: CategoryItem) {
        categoryList.remove(categoryItem)
    }

    override fun editCategoryItem(categoryItem: CategoryItem) {
        val oldCategory = getCategoryItem(categoryItem.id)
        categoryList.remove(oldCategory)
        addCategoryItem(categoryItem)
    }

    override fun getCategoryItem(categoryItemId: Int): CategoryItem {
        return categoryList.find {
            it.id == categoryItemId
        } ?: throw java.lang.RuntimeException("Category with id $categoryItemId not found")
    }

    override fun getCategoryList(): List<CategoryItem> {
        return categoryList.toList()
    }
}
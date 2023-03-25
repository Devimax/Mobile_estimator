package com.example.mobileestimator.domain



import com.example.mobileestimator.R


data class CategoryItem(
    var name: String = UNDEFINED_NAME,
    var id: Int = UNDEFINED_ID
) {

    companion object {

        const val UNDEFINED_ID = -1
        const val UNDEFINED_NAME = "${R.string.undefine_category_name}"
    }
}

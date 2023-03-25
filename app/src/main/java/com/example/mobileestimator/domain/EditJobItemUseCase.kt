package com.example.mobileestimator.domain

class EditJobItemUseCase(private val jobListRepository: JobListRepository) {

    fun editJobItem(jobItem: JobItem) {
        jobListRepository.editJobItem(jobItem)

    }
}
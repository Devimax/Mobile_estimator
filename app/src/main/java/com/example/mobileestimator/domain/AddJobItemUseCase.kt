package com.example.mobileestimator.domain

class AddJobItemUseCase(private val jobListRepository: JobListRepository) {

    fun addJobItem(jobItem: JobItem) {
        jobListRepository.addJobItem(jobItem)
    }
}
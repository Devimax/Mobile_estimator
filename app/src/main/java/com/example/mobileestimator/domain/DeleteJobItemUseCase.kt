package com.example.mobileestimator.domain

class DeleteJobItemUseCase(private val jobListRepository: JobListRepository) {

    fun deleteJobItem(jobItem: JobItem) {
        jobListRepository.deleteJobItem(jobItem)

    }
}
package com.example.mobileestimator.domain

class GetJobItemUseCase(private val jobListRepository: JobListRepository) {

    fun getJobItem(jobItemId: Int): JobItem {
        return jobListRepository.getJobItem(jobItemId)
    }
}
package com.example.mobileestimator.domain

class GetJobListUseCase(private val jobListRepository: JobListRepository) {

    fun getJobList(): List<JobItem> {
        return jobListRepository.getJobList()
    }
}
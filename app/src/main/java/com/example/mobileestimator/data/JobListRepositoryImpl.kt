package com.example.mobileestimator.data

import com.example.mobileestimator.domain.JobItem
import com.example.mobileestimator.domain.JobListRepository

object JobListRepositoryImpl: JobListRepository {

    private val jobList = mutableListOf<JobItem>()

    override fun addJobItem(jobItem: JobItem) {
        jobList.add(jobItem)
    }

    override fun deleteJobItem(jobItem: JobItem) {
        jobList.remove(jobItem)
    }

    override fun editJobItem(jobItem: JobItem) {
        val oldJob = getJobItem(jobItem.id)
        jobList.remove(oldJob)
        addJobItem(jobItem)
    }

    override fun getJobItem(jobItemId: Int): JobItem {
        return jobList.find {
            it.id == jobItemId
        } ?: throw java.lang.RuntimeException("Category with id $jobItemId not found")
    }

    override fun getJobList(): List<JobItem> {
        return jobList.toList()
    }
}
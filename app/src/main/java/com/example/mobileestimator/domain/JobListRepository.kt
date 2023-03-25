package com.example.mobileestimator.domain

interface JobListRepository {

    fun addJobItem(jobItem: JobItem)

    fun deleteJobItem(jobItem: JobItem)

    fun editJobItem(jobItem: JobItem)

    fun getJobItem(jobItemId: Int): JobItem

    fun getJobList(): List<JobItem>
}
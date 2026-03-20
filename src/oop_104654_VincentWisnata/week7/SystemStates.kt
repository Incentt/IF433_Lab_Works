package oop_104654_VincentWisnata.week7

import javax.annotation.processing.Messager

enum class SystemStates {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse{
    data class Success(val data: String) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}
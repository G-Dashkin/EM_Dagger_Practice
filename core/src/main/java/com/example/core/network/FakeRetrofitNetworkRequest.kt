package com.example.core.network

interface FakeRetrofitNetworkRequest {
    suspend fun makeRequest(): String
}
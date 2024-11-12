package com.example.core.network

interface FakeRetrofitNetworkRequestTwo {
    suspend fun makeRequest(): String
}
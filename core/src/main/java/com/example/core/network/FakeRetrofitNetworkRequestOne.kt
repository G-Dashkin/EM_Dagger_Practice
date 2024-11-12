package com.example.core.network

interface FakeRetrofitNetworkRequestOne {
    suspend fun makeRequest(): String
}
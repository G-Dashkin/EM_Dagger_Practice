package com.example.core.network

import kotlinx.coroutines.delay

class FakeRetrofitNetworkRequestOneImpl:FakeRetrofitNetworkRequestOne {
    override suspend fun makeRequest(): String {
        delay(1000)
        return "Fake response from server One"
    }
}
package com.example.home.di

import com.example.core.network.FakeRetrofitNetworkRequest

interface HomeDeps {
    var fakeRetrofitNetworkRequest: FakeRetrofitNetworkRequest
}
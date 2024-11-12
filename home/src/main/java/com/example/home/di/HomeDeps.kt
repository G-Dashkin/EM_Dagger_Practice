package com.example.home.di

import com.example.core.network.FakeRetrofitNetworkRequestOne
import com.example.core.network.FakeRetrofitNetworkRequestTwo

interface HomeDeps {
    val fakeRetrofitNetworkRequestOne: FakeRetrofitNetworkRequestOne
    val fakeRetrofitNetworkRequestTwo: FakeRetrofitNetworkRequestTwo
}
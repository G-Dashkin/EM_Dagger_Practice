package com.example.em_dagger_practice.di

import com.example.core.network.FakeRetrofitNetworkRequest
import com.example.core.network.FakeRetrofitNetworkRequestOneImpl
import com.example.core.network.FakeRetrofitNetworkRequestTwoImpl
import com.example.home.di.FakeRequestOneQualifier
import com.example.home.di.FakeRequestTwoQualifier
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    @FakeRequestOneQualifier
    fun provideFakeRetrofitNetworkRequestOne(): FakeRetrofitNetworkRequest =
        FakeRetrofitNetworkRequestOneImpl()

    @Provides
    @FakeRequestTwoQualifier
    fun provideFakeRetrofitNetworkRequestTwo(): FakeRetrofitNetworkRequest =
        FakeRetrofitNetworkRequestTwoImpl()

}
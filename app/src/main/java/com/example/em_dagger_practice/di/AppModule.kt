package com.example.em_dagger_practice.di

import android.app.Application
import com.example.core.network.FakeRetrofitNetworkRequestOne
import com.example.core.network.FakeRetrofitNetworkRequestOneImpl
import com.example.core.network.FakeRetrofitNetworkRequestTwo
import com.example.core.network.FakeRetrofitNetworkRequestTwoImpl
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideFakeRetrofitNetworkRequestOne(): FakeRetrofitNetworkRequestOne =
        FakeRetrofitNetworkRequestOneImpl()

    @Provides
    fun provideFakeRetrofitNetworkRequestTwo(): FakeRetrofitNetworkRequestTwo =
        FakeRetrofitNetworkRequestTwoImpl()
}
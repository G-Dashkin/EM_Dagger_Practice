package com.example.home.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.core.network.FakeRetrofitNetworkRequest
import com.example.home.R
import com.example.home.di.DaggerHomeComponent
import com.example.home.di.FakeRequestOneQualifier
import com.example.home.di.FakeRequestTwoQualifier
import com.example.home.di.HomeDepsProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.EmptyCoroutineContext

class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var homeViewModelFactoryAssisted: HomeViewModelFactoryAssisted

    @Inject
    @field:FakeRequestOneQualifier
    lateinit var fakeRetrofitNetworkRequestOne: FakeRetrofitNetworkRequest

    @Inject
    @field:FakeRequestTwoQualifier
    lateinit var fakeRetrofitNetworkRequestTwo: FakeRetrofitNetworkRequest

    private val homeViewModel by viewModels<HomeViewModel> {
        homeViewModelFactoryAssisted.create((0..100).random())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeComponent = DaggerHomeComponent.factory().create(HomeDepsProvider.deps)
        homeComponent.inject(this)

        CoroutineScope(EmptyCoroutineContext).launch {
            Log.d("MyLog", fakeRetrofitNetworkRequestOne.makeRequest())
            Log.d("MyLog", fakeRetrofitNetworkRequestTwo.makeRequest())

            Log.d("MyLog", "id in ViewModel:${homeViewModel.id.value}")

        }
    }
}
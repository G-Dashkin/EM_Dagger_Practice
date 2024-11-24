package com.example.home

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.core.network.FakeRetrofitNetworkRequestOne
import com.example.core.network.FakeRetrofitNetworkRequestTwo
import com.example.home.di.DaggerHomeComponent
import com.example.home.di.HomeDepsProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.EmptyCoroutineContext

class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var fakeRetrofitNetworkRequestOne: FakeRetrofitNetworkRequestOne

    @Inject
    lateinit var fakeRetrofitNetworkRequestTwo: FakeRetrofitNetworkRequestTwo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeComponent = DaggerHomeComponent.factory().create(HomeDepsProvider.deps)
        homeComponent.inject(this)

        CoroutineScope(EmptyCoroutineContext).launch {
            Log.d("MyLog", fakeRetrofitNetworkRequestOne.makeRequest())
            Log.d("MyLog", fakeRetrofitNetworkRequestTwo.makeRequest())
        }
    }
}
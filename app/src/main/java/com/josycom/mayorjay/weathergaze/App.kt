package com.josycom.mayorjay.weathergaze

import android.app.Application
import com.josycom.mayorjay.weathergaze.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin {
            androidContext(this@App)
            modules(appModule)
        }
    }
}
package com.rocpjunior.githubrepositorios

import android.app.Application
import com.rocpjunior.githubrepositorios.data.di.DataModule
import com.rocpjunior.githubrepositorios.domain.di.DomainModule
import com.rocpjunior.githubrepositorios.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}
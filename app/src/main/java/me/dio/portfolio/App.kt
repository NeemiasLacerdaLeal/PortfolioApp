package me.dio.portfolio

import android.app.Application
import me.dio.portfolio.repositories.data.di.DataModule
import me.dio.portfolio.repositories.domain.di.DomainModule
import me.dio.portfolio.repositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
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
package com.example.coursesapp.core

import android.app.Application
import com.example.coursesapp.di.dataModule
import com.example.coursesapp.di.domainModule
import com.example.coursesapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CoursesApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CoursesApp)
            modules(dataModule, domainModule, viewModelModule)
        }
    }
}
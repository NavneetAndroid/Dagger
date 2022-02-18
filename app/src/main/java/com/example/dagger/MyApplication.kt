package com.example.dagger

import android.app.Application
import com.example.dagger.DependencyInjection.RetroComponent
import com.example.dagger.DependencyInjection.RetroModule


class MyApplication: Application() {

    private lateinit var retroComponent: RetroComponent

    override fun onCreate() {
        super.onCreate()

        retroComponent =RetroComponent.build()
            .retroModule(RetroModule())
            .build()
    }

    fun getRetroComponent(): RetroComponent {
        return retroComponent
    }
}
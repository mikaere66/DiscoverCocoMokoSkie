package com.michaelrmossman.multiplatform.discover.di

import com.michaelrmossman.multiplatform.discover.presentation.MainViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.component.get
import org.koin.dsl.module

fun initKoin() {

    startKoin {
        modules(getSharedModules())
    }
}

class KoinHelper: KoinComponent {

    fun getAppViewModel() = get<MainViewModel>()
}
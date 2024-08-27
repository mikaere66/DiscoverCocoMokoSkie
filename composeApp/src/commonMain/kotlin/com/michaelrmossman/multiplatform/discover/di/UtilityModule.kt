package com.michaelrmossman.multiplatform.discover.di

import com.michaelrmossman.multiplatform.discover.utils.provideDispatcher
import org.koin.dsl.module

val utilityModule = module {
    factory { provideDispatcher() }
}
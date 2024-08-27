package com.michaelrmossman.multiplatform.discover.di

private val sharedModules = listOf(
    databaseModule,
    utilityModule,
//    getViewModelByPlatform()
    viewModelModule
)

fun getSharedModules() = sharedModules
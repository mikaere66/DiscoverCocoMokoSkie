package com.michaelrmossman.multiplatform.discover.utils

import kotlinx.coroutines.CoroutineDispatcher

internal interface Dispatcher {
    val io: CoroutineDispatcher
}

internal expect fun provideDispatcher():Dispatcher
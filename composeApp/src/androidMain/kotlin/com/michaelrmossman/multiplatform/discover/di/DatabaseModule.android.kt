package com.michaelrmossman.multiplatform.discover.di

import com.michaelrmossman.multiplatform.discover.db.DatabaseDriverFactory
import com.michaelrmossman.multiplatform.discover.db.DatabaseImpl
import com.michaelrmossman.multiplatform.discover.utils.JsonUtils
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

actual val databaseModule = module {

    single<JsonUtils> { JsonUtils() }

    single<DatabaseImpl> {
        DatabaseImpl(
            databaseDriverFactory = DatabaseDriverFactory(
                androidContext()
            ) , json = get()
        )
    }
}
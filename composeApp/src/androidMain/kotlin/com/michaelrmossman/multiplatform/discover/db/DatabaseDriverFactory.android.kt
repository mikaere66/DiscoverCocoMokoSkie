package com.michaelrmossman.multiplatform.discover.db

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.michaelrmossman.multiplatform.discover.utils.Constants.DATABASE_FILENAME

actual class DatabaseDriverFactory(private val context: Context) {

    actual fun createDriver(): SqlDriver {

        return AndroidSqliteDriver(DiscoverDatabase.Schema, context, DATABASE_FILENAME)
    }
}
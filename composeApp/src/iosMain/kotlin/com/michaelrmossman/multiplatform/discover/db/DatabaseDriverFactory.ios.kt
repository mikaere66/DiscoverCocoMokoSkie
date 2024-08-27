package com.michaelrmossman.multiplatform.discover.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.michaelrmossman.multiplatform.discover.utils.Constants.DATABASE_FILENAME

actual class DatabaseDriverFactory {

    actual fun createDriver(): SqlDriver {

       return NativeSqliteDriver(DiscoverDatabase.Schema, DATABASE_FILENAME)
    }
}
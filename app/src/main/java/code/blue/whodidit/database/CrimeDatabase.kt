package code.blue.whodidit.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import code.blue.whodidit.Crime

private const val DATABASE_NAME = "crime-database"

@Database(entities = [ Crime::class ], version=1, exportSchema = false)
@TypeConverters(CrimeTypeConverters::class)
abstract class CrimeDatabase : RoomDatabase() {

    abstract fun crimeDao(): CrimeDao
}
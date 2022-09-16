package com.app.weather.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.app.weather.DashBoard.History.HistoryModel
import com.app.weather.DashBoard.WeatherModel

@Database(entities = [HistoryModel::class], version = 1, exportSchema = false)
abstract class WeatherDataBase:RoomDatabase() {

    abstract fun weatherDao():WeatherDao

    companion object{
        @Volatile
        private var INSTANSE:WeatherDataBase? = null

        fun getDatabase(context: Context):WeatherDataBase {
            val temp = INSTANSE
            if (temp != null) {
                return temp
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WeatherDataBase::class.java,
                    "weather_database"
                ).build()
                INSTANSE=instance
                return instance
            }
        }
    }
}
package com.app.weather.Room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.app.weather.DashBoard.History.HistoryModel
import com.app.weather.DashBoard.WeatherModel
import java.util.*
import kotlin.collections.ArrayList

@Dao
interface WeatherDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addWeatherModel(historyModel: HistoryModel)

    @Query(" SELECT * from weather_table ORDER BY id DESC")
    fun readAllData():List<HistoryModel>

    @Query(" DELETE from weather_table")
    fun removeAllData()
}
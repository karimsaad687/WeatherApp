package com.app.weather.DashBoard.History

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather_table")
data class HistoryModel(
    @PrimaryKey(autoGenerate = true) val id:Int,
    @ColumnInfo(name="image") val image:String,
    @ColumnInfo(name="temp") val temp:String,
    @ColumnInfo(name="location") val location:String,
    @ColumnInfo(name="icon") val icon:Int
)
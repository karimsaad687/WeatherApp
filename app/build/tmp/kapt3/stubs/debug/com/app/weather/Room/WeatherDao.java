package com.app.weather.Room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\b\u0010\t\u001a\u00020\u0003H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/app/weather/Room/WeatherDao;", "", "addWeatherModel", "", "historyModel", "Lcom/app/weather/DashBoard/History/HistoryModel;", "(Lcom/app/weather/DashBoard/History/HistoryModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAllData", "", "removeAllData", "app_debug"})
public abstract interface WeatherDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object addWeatherModel(@org.jetbrains.annotations.NotNull()
    com.app.weather.DashBoard.History.HistoryModel historyModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = " SELECT * from weather_table ORDER BY id DESC")
    public abstract java.util.List<com.app.weather.DashBoard.History.HistoryModel> readAllData();
    
    @androidx.room.Query(value = " DELETE from weather_table")
    public abstract void removeAllData();
}
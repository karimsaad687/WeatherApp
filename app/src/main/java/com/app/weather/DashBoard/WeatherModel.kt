package com.app.weather.DashBoard

import org.json.JSONObject

class WeatherModel {
    lateinit var condition:String
    lateinit var desc:String
    lateinit var icon:String
    lateinit var temp:String

    constructor(data:String) {
        var json = JSONObject(data)
        condition = json.getJSONArray("weather").getJSONObject(0).getString("main")
        desc = json.getJSONArray("weather").getJSONObject(0).getString("description")
        icon="http://openweathermap.org/img/w/" +
                json.getJSONArray("weather").getJSONObject(0).getString("icon") +
                ".png"
        temp = json.getJSONObject("main").getString("temp")
    }
}
package com.revolve44.postmakermassive.models.beta


import com.google.gson.annotations.SerializedName

data class ListWithCoreofForecast(
    @SerializedName("dt")
    val dt: Int,
    @SerializedName("main")
    val main: Main,
    @SerializedName("weather")
    val weather: List<Weather>,
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("wind")
    val wind: Wind,
    @SerializedName("visibility")
    val visibility: Int,
    @SerializedName("pop")
    val pop: Double,
    @SerializedName("sys")
    val sys: Sys,
    @SerializedName("dt_txt")
    val dtTxt: String
)
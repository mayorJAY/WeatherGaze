package com.josycom.mayorjay.weathergaze.data.source.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("/data/2.5/find")
    suspend fun getWeather(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("cnt") noOfCities: Int,
        @Query("appid") apiKey: String
    ): WeatherResponse
}
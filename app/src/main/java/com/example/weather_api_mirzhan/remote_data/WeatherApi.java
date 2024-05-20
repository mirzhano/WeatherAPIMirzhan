package com.example.weather_api_mirzhan.remote_data;
import com.example.weather_api_mirzhan.models.Model;
import com.example.weather_api_mirzhan.models.WeatherModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
//    String URL = "85ac5a338c54a5333f79065778ce1e5a";

    @GET("/data/2.5/weather")
    Call<Model>getCurrentWeather(
            @Query("q") String name,
            @Query("appid") String key);
    @GET("/data/2.5/weather?q=London&appid=85ac5a338c54a5333f79065778ce1e5a")
    Call<WeatherModel>getWeather(
            @Query("q") String name,
            @Query("appid") String key);

    public static final String url="85ac5a338c54a5333f79065778ce1e5a";


}

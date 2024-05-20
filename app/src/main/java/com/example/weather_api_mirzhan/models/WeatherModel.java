package com.example.weather_api_mirzhan.models;

import com.google.gson.annotations.SerializedName;

public class WeatherModel {

    @SerializedName("icon")
    String icon;

    @SerializedName("cod")
    private Integer cod;


}

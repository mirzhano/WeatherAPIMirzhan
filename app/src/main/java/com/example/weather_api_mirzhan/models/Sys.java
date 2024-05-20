package com.example.weather_api_mirzhan.models;

import com.google.gson.annotations.SerializedName;

public class Sys {
    @SerializedName("sunrise")
    private long sunrise;

    @SerializedName("sunset")
    private long sunset;
    public long getSunset(){
        return sunset;
    }
    public long getSunrise(){
        return sunrise;
    }
}

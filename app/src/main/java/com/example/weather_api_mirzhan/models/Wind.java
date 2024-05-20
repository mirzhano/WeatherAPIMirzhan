package com.example.weather_api_mirzhan.models;

import com.google.gson.annotations.SerializedName;

public class Wind {
    @SerializedName("speed")
    private double speed;
    public double getSpeed(){
        return speed;
    }
}

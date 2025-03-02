package com.weatherapp.weather_analytics_server.client;

import com.weatherapp.weather_analytics_server.model.WeatherInfo;

public interface WeatherAPIConsumer {

    WeatherInfo getCurrentWeather(String city);
}

package com.weatherapp.weather_analytics_server.mapper;

import com.fasterxml.jackson.databind.JsonNode;
import com.weatherapp.weather_analytics_server.model.WeatherCondition;
import com.weatherapp.weather_analytics_server.model.WeatherInfo;

public class CurrentWeatherMapper {
    public WeatherInfo mapToWeatherInfo(JsonNode node){
        WeatherInfo weatherInfo = new WeatherInfo();
        WeatherCondition weatherCondition = new WeatherCondition();
        weatherInfo.setLocation(node.path("location").path("name").asText());
        weatherInfo.setRegion(node.path("location").path("region").asText());
        weatherInfo.setCountry(node.path("location").path("country").asText());
        weatherInfo.setTemperature(node.path("current").path("temp_c").asText());
        weatherInfo.setWindSpeed(node.path("current").path("temp_c").asText());
        weatherInfo.setHumidity(node.path("current").path("humidity").asText());
        weatherInfo.setHeatIndex(node.path("current").path("heatindex_c").asText());

        weatherCondition.setText(node.path("current").path("condition").path("text").asText());
        weatherCondition.setCode(node.path("current").path("condition").path("code").asText());
        weatherCondition.setIcon(node.path("current").path("condition").path("icon").asText());

        weatherInfo.setCondition(weatherCondition);
        return weatherInfo;
    }
}

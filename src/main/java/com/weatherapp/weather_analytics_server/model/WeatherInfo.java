package com.weatherapp.weather_analytics_server.model;

public class WeatherInfo {
    private String location;
    private String region;
    private String country;
    private WeatherCondition condition;
    private String temperature;
    private String windSpeed;
    private String humidity;
    private String heatIndex;

    public WeatherInfo(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public WeatherCondition getCondition() {
        return condition;
    }

    public void setCondition(WeatherCondition condition) {
        this.condition = condition;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getHeatIndex() {
        return heatIndex;
    }

    public void setHeatIndex(String heatIndex) {
        this.heatIndex = heatIndex;
    }
}

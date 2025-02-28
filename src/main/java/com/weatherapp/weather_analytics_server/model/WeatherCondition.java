package com.weatherapp.weather_analytics_server.model;

public class WeatherCondition {
    private String text;
    private String icon;
    private String code;

    public WeatherCondition(){}

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

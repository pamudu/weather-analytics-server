package com.weatherapp.weather_analytics_server.client;

public enum APIHelper {
    INSTANCE;
    private static final String SCHEME = "https";
    private static final String HOST = "api.weatherapi.com";
    private static final String VERSION = "v1";
    private static final String CURRENT_ENDPOINT = "current.json";
    private final String apiKey = System.getenv("WEATHER_API_KEY");

    public  String getScheme(){
        return SCHEME;
    }
    public String getHost(){
        return HOST;
    }
    public String getVersion(){
        return VERSION;
    }
    public String getCurrentEndpoint(){
        return CURRENT_ENDPOINT;
    }
    public String getApiKey() {
        return apiKey;
    }
}

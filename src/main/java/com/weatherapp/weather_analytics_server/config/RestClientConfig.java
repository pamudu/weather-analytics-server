package com.weatherapp.weather_analytics_server.config;

import com.weatherapp.weather_analytics_server.mapper.CurrentWeatherMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    private static final String BASE_URL= "http://api.weatherapi.com/v1";
    @Bean
    public RestClient weatherApiRestClient(){
        return RestClient.builder()
                .baseUrl(BASE_URL)
                .build();
    }

    @Bean
    public CurrentWeatherMapper currentWeatherMapper(){
        return new CurrentWeatherMapper();
    }
}

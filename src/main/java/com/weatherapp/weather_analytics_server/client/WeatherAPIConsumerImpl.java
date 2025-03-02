package com.weatherapp.weather_analytics_server.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.weatherapp.weather_analytics_server.mapper.CurrentWeatherMapper;
import com.weatherapp.weather_analytics_server.model.WeatherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriBuilderFactory;

import java.net.URI;

public class WeatherAPIConsumerImpl implements WeatherAPIConsumer {

    private final RestClient client;
    private final CurrentWeatherMapper currentWeatherMapper;

    @Autowired
    public WeatherAPIConsumerImpl(RestClient restClient, CurrentWeatherMapper currentWeatherMapper) {
        this.client = restClient;
        this.currentWeatherMapper = currentWeatherMapper;
    }

    @Override
    public WeatherInfo getCurrentWeather(String city) {
        UriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory();
        URI uri = uriBuilderFactory
                .builder()
                .scheme(APIHelper.INSTANCE.getScheme())
                .host(APIHelper.INSTANCE.getHost())
                .pathSegment(APIHelper.INSTANCE.getVersion(),
                             APIHelper.INSTANCE.getCurrentEndpoint())
                .queryParam("key", APIHelper.INSTANCE.getApiKey())
                .queryParam("q", city)
                .queryParam("aqi", "no")
                .build();


        JsonNode result = this.client.get()
                .uri(uri)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, (request, response) -> {
                              throw new RuntimeException("client error");
                          }
                ).body(JsonNode.class);

        return this.currentWeatherMapper.mapToWeatherInfo(result);
    }
}

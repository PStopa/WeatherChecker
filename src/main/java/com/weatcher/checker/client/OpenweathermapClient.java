package com.weatcher.checker.client;

import com.weatcher.checker.config.OpenWeatherMapConfiguration;
import com.weatcher.checker.domain.WeatherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;

@Component
public class OpenweathermapClient {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OpenWeatherMapConfiguration owmconfig;

    public WeatherDto getWeather(String city) {
        return restTemplate.getForObject(buildUrl(city), WeatherDto.class);
    }

    private URI buildUrl(String city) {
        return UriComponentsBuilder.fromHttpUrl(owmconfig.getApiEndpoint())
                .queryParam("q", city)
                .queryParam("units", "metric")
                .queryParam("appid", owmconfig.getAppId()).build().encode().toUri();
    }
}

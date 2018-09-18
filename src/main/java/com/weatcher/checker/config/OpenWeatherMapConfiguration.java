package com.weatcher.checker.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OpenWeatherMapConfiguration {

    @Value("${openweathermap.app.key}")
    private String appId;

    @Value("${openweathermap.api.endpoint.prod}")
    private String apiEndpoint;

    public String getAppId() {
        return appId;
    }

    public String getApiEndpoint() {
        return apiEndpoint;
    }
}

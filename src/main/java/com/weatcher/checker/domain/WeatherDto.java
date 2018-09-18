package com.weatcher.checker.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherDto {
    @JsonProperty("name")
    private String name;
    @JsonProperty("main")
    private MainWeather main;

    public WeatherDto(String name, MainWeather main) {
        this.name = name;
        this.main = main;
    }

    public WeatherDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MainWeather getMain() {
        return main;
    }

    public void setMain(MainWeather main) {
        this.main = main;
    }
}

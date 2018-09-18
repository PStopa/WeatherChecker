package com.weatcher.checker.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MainWeather {
    @JsonProperty("temp")
    private String temp;
    @JsonProperty("pressure")
    private String pressure;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("temp_min")
    private String temp_min;
    @JsonProperty("temp_max")
    private String temp_max;

    public MainWeather(String temp, String pressure, String humidity, String temp_min, String temp_max) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }

    public MainWeather() {
    }

    public String getTemp() {
        return temp;
    }

    public String getPressure() {
        return pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public String getTemp_max() {
        return temp_max;
    }
}

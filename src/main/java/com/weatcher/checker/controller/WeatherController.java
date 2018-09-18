package com.weatcher.checker.controller;

import com.weatcher.checker.client.OpenweathermapClient;
import com.weatcher.checker.domain.WeatherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/weather")
public class WeatherController {

    @Autowired
    private OpenweathermapClient owmClient;

    @RequestMapping(method = RequestMethod.GET, value = "getWeather")
    public WeatherDto getWeather(@RequestParam String city) {
        return owmClient.getWeather(city);
    }
}

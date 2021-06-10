package com.timizi.ohmygalaxy.service;

import com.timizi.ohmygalaxy.config.OhMyGalaxyNasaConfig;
import com.timizi.ohmygalaxy.controller.pojo.MarsTempDataRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import javax.print.DocFlavor;

@Service
@Slf4j
public class NasaMarsWeatherApiServiceImpl implements NasaMarsWeatherApiService {

    private static final String JSON_FIELD_TYPE = "json" ;
    private static final String VERSION = "1.0" ;
    @Autowired
    private OhMyGalaxyNasaConfig config;

    /**
     * This functions call NASA API to get Latest Data from Mars
     * https://mars.nasa.gov/insight/weather/
     *
     * @return latest response from Nasa API for mars Data
     * */

    @Override
    public ResponseEntity<?> getMarsTempDataDirectly() {
        WebClient.ResponseSpec responseFromNasa = callNasaWeatherApi();
        log.info("Response from NASA : {}" , responseFromNasa.bodyToMono(String.class));
        Object response = responseFromNasa.bodyToMono(Object.class);
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }

    private WebClient.ResponseSpec callNasaWeatherApi() {
        return WebClient.create(config.getUrl())
                .method(HttpMethod.GET)
                .uri(builder -> builder.path(config.getPath()).queryParam("api_key", config.getApiKey()).queryParam("feedtype",JSON_FIELD_TYPE).queryParam("ver" , VERSION).build())
                .header("Accept", "application/json, text/plain, */*")
                .retrieve();
    }
}

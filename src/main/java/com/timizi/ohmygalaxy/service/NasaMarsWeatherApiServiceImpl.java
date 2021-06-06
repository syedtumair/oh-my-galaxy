package com.timizi.ohmygalaxy.service;

import com.timizi.ohmygalaxy.controller.pojo.MarsTempDataRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NasaMarsWeatherApiServiceImpl implements NasaMarsWeatherApiService {

    /**
     * This functions call NASA API to get Latest Data from Mars
     * https://mars.nasa.gov/insight/weather/
     *
     * @return latest response from Nasa API for mars Data
     * */

    @Override
    public ResponseEntity<?> getMarsTempDataDirectly(MarsTempDataRequest request) {
       return null;
    }
}

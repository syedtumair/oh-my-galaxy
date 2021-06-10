package com.timizi.ohmygalaxy.service;

import com.timizi.ohmygalaxy.controller.pojo.MarsTempDataRequest;
import org.springframework.http.ResponseEntity;

public interface NasaMarsWeatherApiService {
    ResponseEntity<?> getMarsTempDataDirectly();
}

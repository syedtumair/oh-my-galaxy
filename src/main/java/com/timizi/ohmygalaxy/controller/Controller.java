package com.timizi.ohmygalaxy.controller;

import com.sun.istack.NotNull;
import com.timizi.ohmygalaxy.controller.pojo.MarsTempDataRequest;
import com.timizi.ohmygalaxy.service.NasaMarsWeatherApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @Autowired
    private NasaMarsWeatherApiService marsWeatherService;

    @GetMapping("v1.0/omg/planets/mars/temp/now")
    private ResponseEntity<?> getMarsTempData(@RequestHeader (value = "Authorization" , required = true ) String authToken ) {
        log.info("request received at mars temp module");
        return marsWeatherService.getMarsTempDataDirectly();
    }



}

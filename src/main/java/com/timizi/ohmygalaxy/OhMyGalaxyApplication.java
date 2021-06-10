package com.timizi.ohmygalaxy;

import com.timizi.ohmygalaxy.config.OhMyGalaxyNasaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties( value = {OhMyGalaxyNasaConfig.class})
public class OhMyGalaxyApplication {
    public static void main(String[] args) {
        SpringApplication.run(OhMyGalaxyApplication.class, args);
    }

}

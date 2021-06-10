package com.timizi.ohmygalaxy.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;


@ConfigurationProperties(prefix = "omg.nasa")
@Data
@Validated
public class OhMyGalaxyNasaConfig {
    private String url ;
    private String path;
    private String apiKey;

}

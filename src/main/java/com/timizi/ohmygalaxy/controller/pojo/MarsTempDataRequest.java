package com.timizi.ohmygalaxy.controller.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@RequiredArgsConstructor
public class MarsTempDataRequest {

    @JsonProperty("appId")
    String appId;

    @JsonProperty("timestamp")
    Timestamp timestamp;

    @Override
    public String toString(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}

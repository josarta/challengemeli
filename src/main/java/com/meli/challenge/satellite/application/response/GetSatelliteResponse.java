package com.meli.challenge.satellite.application.response;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class GetSatelliteResponse {
    private String code;
    private String message;
    private Map<String, Double> position = new HashMap<String, Double>();

    public GetSatelliteResponse(String message, Map<String, Double> position) {
        this.message = message;
        this.position = position;
        this.code = HttpStatus.OK.toString();
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Map<String, Double> getPosition() {
        return position;
    }


}

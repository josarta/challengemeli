package com.meli.challenge.satellite.application.response;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.test.util.AssertionErrors;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GetSatelliteResponseTest {

     String code;
     String message;
     Map<String, Double> position = new HashMap<String, Double>();

    @Test
    void getCode() {
        GetSatelliteResponse gsr = new GetSatelliteResponse(message,position);
        String codeEx = HttpStatus.OK.toString();
        String codeAc = gsr.getCode();
        AssertionErrors.assertEquals("ok-getCode",codeEx,codeAc);
    }

    @Test
    void getMessage() {
        String messaeEx = "Operación Fuego de Quasar";
        GetSatelliteResponse gsr = new GetSatelliteResponse(messaeEx,position);
        String messaeAc = gsr.getMessage();
        AssertionErrors.assertEquals("ok-getCode",messaeEx,messaeAc);
    }

    @Test
    void getPosition() {
        Map<String, Double>  positionEX = new HashMap<>();
        positionEX.put("x",-1000.0);
        positionEX.put("y",-1000.1);
        GetSatelliteResponse gsr = new GetSatelliteResponse(message,positionEX);
        Map<String, Double>  positionAc = gsr.getPosition();
        AssertionErrors.assertEquals("ok-getCode",positionEX,positionAc);
    }
}
package com.meli.challenge.satellite.application.rest;


import com.meli.challenge.message.domain.Message;
import com.meli.challenge.message.domain.exception.NoDataFoundException;
import com.meli.challenge.satellite.application.request.GetSatelliteRequest;
import com.meli.challenge.satellite.application.response.GetSatelliteResponse;
import com.meli.challenge.satellite.domain.service.SatelliteService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/topsecret")
@Api(value="SatelliteApi", description="Nivel 2 Crear una API REST,  en donde se pueda obtener la ubicación de la nave y el mensaje que emite")
public class SatelliteController {

    private final SatelliteService satelliteService;

    @Autowired
    public SatelliteController(SatelliteService satelliteService) {
        this.satelliteService = satelliteService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    GetSatelliteResponse getSatelliteResponse(@RequestBody final GetSatelliteRequest getSharedRequest) throws NoDataFoundException {
        String message = satelliteService.getDecodeMessage(new Message(getSharedRequest.getListMessages()));
            double[] positionIn = satelliteService.getShipPosition(getSharedRequest.getDistances());
            Map<String, Double> position = new HashMap<String, Double>();
            position.put("x",positionIn[0]);
            position.put("y",positionIn[1]);
            return new GetSatelliteResponse(message,position);

    }

}




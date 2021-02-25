package com.meli.challenge.satellite.application.rest;


import com.meli.challenge.message.domain.Message;
import com.meli.challenge.message.domain.exception.NoDataFoundException;
import com.meli.challenge.satellite.application.request.GetSatelliteSplitRequest;
import com.meli.challenge.satellite.application.response.GetSatelliteResponse;
import com.meli.challenge.satellite.domain.service.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

import static com.meli.challenge.constant.ConstantDomain.*;


@RestController
@RequestMapping("/topsecret_split")
public class SatelliteSplitController {

    private final SatelliteService satelliteService;

    @Autowired
    public SatelliteSplitController(SatelliteService satelliteService) {
        this.satelliteService = satelliteService;
    }


    @GetMapping(value = "/{name}", consumes = MediaType.APPLICATION_JSON_VALUE)
    GetSatelliteResponse getSatelliteResponsee(@PathVariable final String name, @RequestBody final GetSatelliteSplitRequest getSatelliteSplitRequest) {
        List<String> messageIn = getSatelliteSplitRequest.getMessage();
        List<List<String>> messageLis = new ArrayList<>();
        messageLis.add(messageIn);
        try {
            String message = satelliteService.getDecodeMessage(new Message(messageLis));
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format(DATA_ERROR_POSITION, message));
        } catch (NoDataFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getPerMessage(), e);
        }
    }

    @PostMapping(value = "/{name}", consumes = MediaType.APPLICATION_JSON_VALUE)
    GetSatelliteResponse postSatelliteResponse(@PathVariable final String name, @RequestBody final GetSatelliteSplitRequest getSatelliteSplitRequest) {
        List<String> messageIn = getSatelliteSplitRequest.getMessage();
        List<List<String>> messageLis = new ArrayList<>();
        messageLis.add(messageIn);
        try {
            String message = satelliteService.getDecodeMessage(new Message(messageLis));
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format(DATA_ERROR_POSITION, message));
        } catch (NoDataFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getPerMessage(), e);
        }
    }
}


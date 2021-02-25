package com.meli.challenge.satellite.domain.service;

import com.meli.challenge.message.domain.Message;
import com.meli.challenge.message.domain.exception.NoDataFoundException;
import com.meli.challenge.message.domain.service.DomainMessageService;
import com.meli.challenge.ship.domain.service.DomainShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DomainSatelliteService implements SatelliteService {
    @Autowired
    DomainMessageService domainMessageService;

    @Autowired
    DomainShipService domainShipService;

    public String getDecodeMessage( Message liMessage) throws NoDataFoundException {
         return  domainMessageService.getMessage(liMessage);
    }

    public double[] getShipPosition (double[] distances){
        return  domainShipService.getLocation(distances);
    }

    public double[] getShipPosition (double[] distances ,String nameShip){
        return  domainShipService.getLocation(distances , nameShip);
    }




}

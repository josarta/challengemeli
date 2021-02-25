package com.meli.challenge.satellite.domain.service;

import com.meli.challenge.message.domain.Message;
import com.meli.challenge.message.domain.exception.NoDataFoundException;

public interface SatelliteService {
    String getDecodeMessage( Message liMessage) throws NoDataFoundException;
    double[] getShipPosition (double[] distances);
    double[] getShipPosition (double[] distances , String nameShip);
}

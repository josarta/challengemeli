package com.meli.challenge.ship.domain.service;


public interface ShipService  {

    public double[] getLocation(double[][] positions, double [] distances);
    public double[] getLocation(double [] distances);
    public double[] getLocation( double[] distances , String nameShip);
    public double[][] getPositions();
}

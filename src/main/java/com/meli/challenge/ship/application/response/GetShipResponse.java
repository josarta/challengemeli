package com.meli.challenge.ship.application.response;

public class GetShipResponse {
    private final double x;
    private final double y;

    public GetShipResponse(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public GetShipResponse(double[] points){
        this.x = points[0];
        this.y = points[1];
    }
    public double getY() {
        return y;
    }
    public double getX() {
        return x;
    }

    @Override
    public String toString(){
        return x+","+y;
    }
}

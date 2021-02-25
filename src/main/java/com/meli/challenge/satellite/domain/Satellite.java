package com.meli.challenge.satellite.domain;

import java.util.List;

public class Satellite {
    private double distance;
    private String name;

    public Satellite(double distance, String name, List<String> message) {
        this.distance = distance;
        this.name = name;
        this.message = message;
    }

    private List<String> message;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public double getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public List<String> getMessage() {
        return message;
    }
}


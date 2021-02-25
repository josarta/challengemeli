package com.meli.challenge.satellite.domain;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SatelliteTest {

    double distance = 10.5;
    String name = "Kenobi";
    List<String> message = new ArrayList<>();



    @Test
    void setDistance() {
        Satellite stTest = new Satellite(distance,name,message);
        stTest.setDistance(-100.5);
        double expectedDistance = stTest.getDistance();
        double actualDistance= -100.5;
        AssertionErrors.assertEquals("ok-SetDistance",expectedDistance,actualDistance);
    }

    @Test
    void setName() {
        Satellite stTest = new Satellite(distance,name,message);
        stTest.setName("sato");
        String expectedName = stTest.getName();
        String actualName= "sato";
        AssertionErrors.assertEquals("ok-setName",expectedName,actualName);
    }

    @Test
    void setMessage() {
        message.add("esto");
        message.add(" ");
        message.add("es");
        message.add(" ");
        message.add("un");
        message.add(" ");
        message.add("mensaje");
        Satellite stTest = new Satellite(distance,name,new ArrayList<>());
        stTest.setMessage(message);
        List<String> expectedMessage = stTest.getMessage();
        List<String> actualMessage = message;
        AssertionErrors.assertEquals("ok-setName",expectedMessage,actualMessage);

    }

    @Test
    void getDistance() {
        Satellite stTest = new Satellite(distance,name,message);
        double expectedDistance = stTest.getDistance();
        double actualDistance= 10.5;
        AssertionErrors.assertEquals("ok-SetDistance",expectedDistance,actualDistance);

    }

    @Test
    void getName() {
        Satellite stTest = new Satellite(distance,name,message);
        String expectedName = stTest.getName();
        String actualName= "Kenobi";
        AssertionErrors.assertEquals("ok-setName",expectedName,actualName);
    }

    @Test
    void getMessage() {
        message.add("esto");
        message.add(" ");
        message.add("es");
        message.add(" ");
        message.add("un");
        message.add(" ");
        message.add("mensaje");
        Satellite stTest = new Satellite(distance,name,message);
        List<String> expectedMessage = stTest.getMessage();
        List<String> actualMessage = message;
        AssertionErrors.assertEquals("ok-setName",expectedMessage,actualMessage);
    }
}
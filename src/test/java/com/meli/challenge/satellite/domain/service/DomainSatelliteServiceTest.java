package com.meli.challenge.satellite.domain.service;

import com.meli.challenge.message.domain.Message;
import com.meli.challenge.message.domain.exception.NoDataFoundException;
import com.meli.challenge.message.domain.service.DomainMessageService;
import com.meli.challenge.ship.domain.service.DomainShipService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.util.AssertionErrors;

import java.util.ArrayList;
import java.util.List;

import static com.meli.challenge.constant.ConstantChallenge.BLANK;

@SpringBootTest
@TestPropertySource(locations = "classpath:challenge-layers.properties")
class DomainSatelliteServiceTest {
    double[] distances = new double[] { 10, -100, 500 };;
    Message liMessage;

    @Autowired
    DomainShipService domainShipService;
    @Autowired
    DomainMessageService domainMessageService;

    @Test
    void getDecodeMessage() throws NoDataFoundException {
        List<String> satelliteOne = new ArrayList<>();
        satelliteOne.add("este");
        satelliteOne.add(BLANK);
        satelliteOne.add(BLANK);
        satelliteOne.add("mensaje");
        satelliteOne.add(BLANK);


        List<String> satelliteTwo = new ArrayList<>();
        satelliteTwo.add(BLANK);
        satelliteTwo.add("es");
        satelliteTwo.add(BLANK);
        satelliteTwo.add(BLANK);
        satelliteTwo.add("secreto");


        List<String> satelliteTree = new ArrayList<>();
        satelliteTree.add("este");
        satelliteTree.add(BLANK);
        satelliteTree.add("un");
        satelliteTree.add(BLANK);
        satelliteTree.add(BLANK);

        ArrayList<List<String>> listSatellites = new ArrayList<>();

        listSatellites.add(satelliteOne);
        listSatellites.add(satelliteTwo);
        listSatellites.add(satelliteTree);

        DomainMessageService ds = new DomainMessageService();
        Message ms = new Message(listSatellites);

        String messageActual =  domainMessageService.getMessage(ms);
        String messageExpected = "este es un mensaje secreto";
        AssertionErrors.assertEquals("ok",messageExpected,messageActual);
    }

    @Test
    void getShipPosition() {
        double[] positionActual = domainShipService.getLocation(distances);
        double[] positionExpected = {99.99721379992374,-100.00046379860585};
        AssertionErrors.assertEquals("ok",positionExpected,positionActual);
    }

    @Test
    void testGetDecodeMessage() throws NoDataFoundException {
        List<String> satelliteOne = new ArrayList<>();
        satelliteOne.add("este");
        satelliteOne.add(BLANK);
        satelliteOne.add(BLANK);
        satelliteOne.add("mensaje");
        satelliteOne.add(BLANK);


        List<String> satelliteTwo = new ArrayList<>();
        satelliteTwo.add(BLANK);
        satelliteTwo.add("es");
        satelliteTwo.add(BLANK);
        satelliteTwo.add(BLANK);
        satelliteTwo.add("secreto");


        List<String> satelliteTree = new ArrayList<>();
        satelliteTree.add("este");
        satelliteTree.add(BLANK);
        satelliteTree.add("un");
        satelliteTree.add(BLANK);
        satelliteTree.add(BLANK);

        ArrayList<List<String>> listSatellites = new ArrayList<>();

        listSatellites.add(satelliteOne);
        listSatellites.add(satelliteTwo);
        listSatellites.add(satelliteTree);

        DomainMessageService ds = new DomainMessageService();
        Message ms = new Message(listSatellites);

        String messageActual =  domainMessageService.getMessage(ms);
        String messageExpected = "este es un mensaje secreto";


    }

    @Test
    void testGetShipPosition() {
        double[] positionActual = domainShipService.getLocation(distances);
        double[] positionExpected = {99.99721379992374,-100.00046379860585};
        AssertionErrors.assertEquals("ok",positionExpected,positionActual);

    }
}
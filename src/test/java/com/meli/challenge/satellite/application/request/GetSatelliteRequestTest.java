package com.meli.challenge.satellite.application.request;

import com.meli.challenge.satellite.domain.Satellite;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static com.meli.challenge.constant.ConstantChallenge.BLANK;
import static org.junit.jupiter.api.Assertions.*;

class GetSatelliteRequestTest {
    List<Satellite> satelliteList = new ArrayList<>();
    List<List<String>> listMessages = new ArrayList<>();
    double[] distances;

    @Test
    void getSatelliteList() {

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

        Satellite s1 = new Satellite(100,"Kenobi",satelliteOne);
        Satellite s2 = new Satellite(100,"Skywalker",satelliteTwo);
        Satellite s3 = new Satellite(100,"Sato",satelliteTree);

        List<Satellite>  listExpectedSatellite = new ArrayList<>();
        listExpectedSatellite.add(s1);
        listExpectedSatellite.add(s2);
        listExpectedSatellite.add(s3);

        GetSatelliteRequest gsr = new GetSatelliteRequest(listExpectedSatellite,listMessages,distances);
        List<Satellite>  lisActualSatellite = gsr.getSatelliteList();
        AssertionErrors.assertEquals("ok-getSatelliteList",listExpectedSatellite,lisActualSatellite);

    }

    @Test
    void getListMessages() {

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

        ArrayList<List<String>> listExpectedMessages = new ArrayList<>();

        GetSatelliteRequest gsr = new GetSatelliteRequest(satelliteList,listExpectedMessages,distances);
        List<List<String>>  lisActualMessages= gsr.getListMessages();
        AssertionErrors.assertEquals("ok-getListMessages",listExpectedMessages,lisActualMessages);

    }

    @Test
    void getDistances() {
        double[] distancesExpectec = new double[]{100,-200};
        GetSatelliteRequest gsr = new GetSatelliteRequest(satelliteList,listMessages,distancesExpectec);
        double[] distancesActual = gsr.getDistances();
        AssertionErrors.assertEquals("ok-getListMessages",distancesExpectec,distancesActual);
    }
}
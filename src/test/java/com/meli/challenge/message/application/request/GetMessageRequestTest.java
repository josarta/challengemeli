package com.meli.challenge.message.application.request;

import com.meli.challenge.message.domain.Message;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import java.util.ArrayList;
import java.util.List;

import static com.meli.challenge.constant.ConstantChallenge.BLANK;

class GetMessageRequestTest {

    @Test
    void getMessages() {
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


        GetMessageRequest gs = new GetMessageRequest(listSatellites);
        Message msgRes = gs.getMessages();
        Message msgAct = new Message(listSatellites);
        AssertionErrors.assertEquals("ok",msgRes.getMessage(),msgAct.getMessage());
    }
}
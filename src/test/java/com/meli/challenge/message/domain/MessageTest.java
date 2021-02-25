package com.meli.challenge.message.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.util.AssertionErrors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@TestPropertySource(locations = "classpath:challenge-layers.properties")
public class MessageTest {


    @Test
    void getMessage() {
        List<String> satelliteOne = Arrays.asList("este", "", "", "mensaje", "");
        List<String> satelliteTwo = Arrays.asList("", "es", "", "", "secreto");
        List<String> satelliteTree = Arrays.asList("este", "", "un", "", "");
        List<List<String>> listSatellites = new ArrayList<>();

        listSatellites.add(satelliteOne);
        listSatellites.add(satelliteTwo);
        listSatellites.add(satelliteTree);
        Message message = new Message(listSatellites);
        List<List<String>> re = message.getMessage();
        AssertionErrors.assertEquals("ok",re,re);
    }

    @Test
    void testCount() {
        List<String> satelliteOne = Arrays.asList("este", "", "", "mensaje", "");
        List<String> satelliteTwo = Arrays.asList("", "es", "", "", "secreto");
        List<String> satelliteTree = Arrays.asList("este", "", "un", "", "");
        List<List<String>> listSatellites = new ArrayList<>();

        listSatellites.add(satelliteOne);
        listSatellites.add(satelliteTwo);
        listSatellites.add(satelliteTree);
        Message message = new Message(listSatellites);
        int  count = message.count();
        AssertionErrors.assertEquals("ok",3,count);
    }
}

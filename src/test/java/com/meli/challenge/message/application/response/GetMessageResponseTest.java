package com.meli.challenge.message.application.response;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.test.util.AssertionErrors;

import static org.junit.jupiter.api.Assertions.*;

class GetMessageResponseTest {

    @Test
    void getMessageReceived() {
            String messageReceived = "este es un mensaje secreto";
            String code = HttpStatus.OK.toString();
            GetMessageResponse gmr = new GetMessageResponse(messageReceived);
            AssertionErrors.assertTrue("ok",gmr.getMessageReceived().equalsIgnoreCase(messageReceived));
    }
}
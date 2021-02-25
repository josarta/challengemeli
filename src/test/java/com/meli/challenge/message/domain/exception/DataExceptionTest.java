package com.meli.challenge.message.domain.exception;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.util.AssertionErrors;

import static org.junit.jupiter.api.Assertions.assertThrows;


class DataExceptionTest {
    @Autowired
    DataException dataException;


    @Test
    void getMessage() {
        DataException exception = assertThrows(DataException.class, () -> {
            throw new NoDataFoundException();
        });

        String expectedMessage = "Sin datos";
        String actualMessage = exception.getMessage();
        AssertionErrors.assertEquals("ok-getMessage",expectedMessage,actualMessage);
    }

}
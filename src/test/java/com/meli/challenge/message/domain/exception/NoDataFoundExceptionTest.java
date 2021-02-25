package com.meli.challenge.message.domain.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.util.AssertionErrors;

import static com.meli.challenge.constant.ConstantDomain.DATA_ERROR_WORDS;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:challenge-layers.properties")
class NoDataFoundExceptionTest {


    @Test
    void getCode() {
        NoDataFoundException exception = assertThrows(NoDataFoundException.class, () -> {
            throw new NoDataFoundException("Get CODE");
        });
        String expectedCode = HttpStatus.NO_CONTENT.toString();
        String actualCode = exception.getCode();
        AssertionErrors.assertTrue("ok",expectedCode.equalsIgnoreCase(actualCode));
    }

    @Test
    void getMessage() {
        NoDataFoundException exception = assertThrows(NoDataFoundException.class, () -> {
            throw new NoDataFoundException();
        });
        String expectedMessage = "Sin datos";
        String actualMessage = exception.getMessage();
        AssertionErrors.assertEquals("ok-getMessage",expectedMessage,actualMessage);
    }

    @Test
    void getPerMessage() {
        NoDataFoundException exception = assertThrows(NoDataFoundException.class, () -> {
            throw new NoDataFoundException("Get PerMessage");
        });
        String expectedPerMessage = "Get PerMessage";
        String actualPerMessage = exception.getPerMessage();
        AssertionErrors.assertEquals("ok-getPerMessage",expectedPerMessage,actualPerMessage);
    }
}
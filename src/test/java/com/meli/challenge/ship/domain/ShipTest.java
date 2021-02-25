package com.meli.challenge.ship.domain;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    Position position = new Position(new double[]{-12.0,20.0});

    @Test
    void setPosition() {
        Ship shipTest = new Ship();
        Position positionEx = position;
        shipTest.setPosition(positionEx);
        Position positionAc = shipTest.getPosition();
        AssertionErrors.assertEquals("ok->setPosition",positionEx,positionAc);
    }

    @Test
    void getPosition() {
        Ship shipTest = new Ship(position);
        Position positionEx = position;
        Position positionAc = shipTest.getPosition();
        AssertionErrors.assertEquals("ok->setPosition",positionEx,positionAc);

    }
}
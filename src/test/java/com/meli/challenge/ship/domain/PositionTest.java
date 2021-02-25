package com.meli.challenge.ship.domain;

import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    private double x;
    private  double y;

    @Test
    void setY() {
        Position ps = new Position(new double[]{10,20});
        ps.setY(85.0);
        AssertionErrors.assertTrue("ok->setY", ps.getY() == 85.0);
    }

    @Test
    void setX() {
        Position ps = new Position(new double[]{10,20});
        ps.setX(85.0);
        AssertionErrors.assertTrue("ok->setX", ps.getX() == 85.0);
    }

    @Test
    void getY() {
        Position ps = new Position(new double[]{10,20});
        AssertionErrors.assertTrue("ok->getY", ps.getY() == 20);
    }

    @Test
    void getX() {
        Position ps = new Position(new double[]{10,20});
        AssertionErrors.assertTrue("ok->getX", ps.getX() == 10);
    }

    @Test
    void testToString() {
        Position ps = new Position(new double[]{10,20});
        String messageEx = ps.toString();
        String messageAc = "10.0,20.0";
        AssertionErrors.assertEquals("ok->testToString", messageEx, messageAc);
    }
}
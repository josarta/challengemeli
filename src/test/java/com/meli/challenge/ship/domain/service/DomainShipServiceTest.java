package com.meli.challenge.ship.domain.service;

import com.lemmingapex.trilateration.NonLinearLeastSquaresSolver;
import com.lemmingapex.trilateration.TrilaterationFunction;
import org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

import java.util.Arrays;

@SpringBootTest
class DomainShipServiceTest {

    @Autowired
    ShipService shipService;

    @Test
    void satellitesPosition() {
        String sKi = "-500.0#-200.0";
        double[] dKi = Arrays.stream(sKi.split("#")).mapToDouble(Double::parseDouble).toArray();
        String sSr = "100.0#-100.0";
        double[] dSr = Arrays.stream(sSr.split("#")).mapToDouble(Double::parseDouble).toArray();
        String sSo = "500.0#100.0";
        double[] dSo = Arrays.stream(sSo.split("#")).mapToDouble(Double::parseDouble).toArray();
        double[][] positionsEx = new double[][] { dKi, dSr, dSo};
        double[][] positionsAc = new double[][] { {-500.0,-200.0}, {100.0,-100.0}, {500.0,100.0}};
        AssertionErrors.assertNotEquals("ok-satellitesPosition",positionsEx,positionsAc);
    }

    @Test
    void getLocation() {
        double[][] positions = new double[][] { { 5.0, -6.0 }, { 13.0, -15.0 }, { 21.0, -3.0 }, { 12.4, -21.2 } };
        double[] distances = new double[] { 8.06, 13.97, 23.32, 15.31 };
        TrilaterationFunction trilaterationFunction = new TrilaterationFunction(positions, distances);
        NonLinearLeastSquaresSolver nSolver = new NonLinearLeastSquaresSolver(trilaterationFunction, new LevenbergMarquardtOptimizer());
        double[] getLocationAc =  nSolver.solve().getPoint().toArray();
        double[] getLocationEx =  new double[]{-0.3621329519856158,-12.231923418859497};
        AssertionErrors.assertEquals("ok-getLocation",getLocationEx,getLocationAc);
    }

    @Test
    void getPositions() {
        String sKi = "-500.0#-200.0";
        double[] dKi = Arrays.stream(sKi.split("#")).mapToDouble(Double::parseDouble).toArray();
        String sSr = "100.0#-100.0";
        double[] dSr = Arrays.stream(sSr.split("#")).mapToDouble(Double::parseDouble).toArray();
        String sSo = "500.0#100.0";
        double[] dSo = Arrays.stream(sSo.split("#")).mapToDouble(Double::parseDouble).toArray();
        double[][] positionsEx = new double[][] { dKi, dSr, dSo};
        double[] distances = new double[] { 8.06, 13.97, 23.32 };
        shipService.getLocation(distances);
        double[][] positionsAc = shipService.getPositions();
        AssertionErrors.assertNotEquals("ok-getPositions",positionsEx,positionsAc);

    }
}
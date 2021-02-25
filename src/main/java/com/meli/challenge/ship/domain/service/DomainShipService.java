package com.meli.challenge.ship.domain.service;

import com.lemmingapex.trilateration.NonLinearLeastSquaresSolver;
import com.lemmingapex.trilateration.TrilaterationFunction;
import org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;

import static com.meli.challenge.constant.ConstantDomain.*;

@Service
public class DomainShipService implements  ShipService {

    private static double[][] positions;
    @Value( "${satellites.ki}" )
    private String sKi;
    @Value( "${satellites.sr}" )
    private String sSr;
    @Value( "${satellites.so}" )
    private String sSo;


    public static void satellitesPosition(String sKi, String sSr, String sSo) {
        double[] dKi = Arrays.stream(sKi.split("#")).mapToDouble(Double::parseDouble).toArray();
        double[] dSr = Arrays.stream(sSr.split("#")).mapToDouble(Double::parseDouble).toArray();
        double[] dSo = Arrays.stream(sSo.split("#")).mapToDouble(Double::parseDouble).toArray();
        positions = new double[][] { dKi, dSr, dSo};
    }

    @Override
    public double[] getLocation(double[][] positions, double[] distances) {
        TrilaterationFunction trilaterationFunction = new TrilaterationFunction(positions, distances);
        NonLinearLeastSquaresSolver nSolver = new NonLinearLeastSquaresSolver(trilaterationFunction, new LevenbergMarquardtOptimizer());
        return  nSolver.solve().getPoint().toArray();
    }

    @Override
    public double[] getLocation( double[] distances) {
        satellitesPosition(sKi, sSr, sSo);
        TrilaterationFunction trilaterationFunction = new TrilaterationFunction(positions, distances);
        NonLinearLeastSquaresSolver nSolver = new NonLinearLeastSquaresSolver(trilaterationFunction, new LevenbergMarquardtOptimizer());
        return  nSolver.solve().getPoint().toArray();
    }

    @Override
    public double[] getLocation( double[] distances , String nameShip) {
        double[] dOut;
        switch (nameShip.toLowerCase()){
            case KENOBI:
                dOut = Arrays.stream(sKi.split("#")).mapToDouble(Double::parseDouble).toArray();
                break;
            case SKYWALKER:
                dOut = Arrays.stream(sSr.split("#")).mapToDouble(Double::parseDouble).toArray();
                break;
            case SATO:
                dOut = Arrays.stream(sSo.split("#")).mapToDouble(Double::parseDouble).toArray();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + nameShip.toLowerCase());
        }
        positions = new double[][] {dOut};
        TrilaterationFunction trilaterationFunction = new TrilaterationFunction(positions, distances);
        NonLinearLeastSquaresSolver nSolver = new NonLinearLeastSquaresSolver(trilaterationFunction, new LevenbergMarquardtOptimizer());
        return  nSolver.solve().getPoint().toArray();
    }

    public double[][] getPositions() {
        return positions;
    }

}

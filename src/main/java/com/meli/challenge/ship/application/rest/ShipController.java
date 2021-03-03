package com.meli.challenge.ship.application.rest;

import com.meli.challenge.ship.application.response.GetShipResponse;
import com.meli.challenge.ship.application.resquest.GetShipRequest;
import com.meli.challenge.ship.domain.service.DomainShipService;
import com.meli.challenge.ship.domain.service.ShipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;

import static com.meli.challenge.constant.ConstantChallenge.*;


@RestController
@RequestMapping("/location")
@Api(value="ShipApi", description="Nivel 1 Exposición del método desde el dominio que responde  a  -> func GetLocation(distances ...float32) (x, y float32)")
public class ShipController {

    private  final ShipService shipService;
    @Value( "${satellites.ki}" )
    private String sKi;
    @Value( "${satellites.sr}" )
    private String sSr;
    @Value( "${satellites.so}" )
    private String sSo;

    @Autowired
    public ShipController(ShipService shipService) {
        this.shipService = shipService;
    }


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    GetShipResponse getShipResponse(@RequestBody final GetShipRequest getShipRequest)  {
        DomainShipService.satellitesPosition(sKi, sSr, sSo);
        List<LinkedHashMap> objectList = getShipRequest.getCoordinates();
        double ki = 0;
        double sr = 0;
        double so = 0;
        for (LinkedHashMap obj: objectList) {

            switch (obj.get(NAME).toString()){
                case SATO:
                    so = ((Number) obj.get(DISTANCE)).doubleValue() ;
                    break;
                case SKYWALKER:
                    sr = ((Number) obj.get(DISTANCE)).doubleValue() ;
                    break;
                case KENOBI:
                    ki = ((Number) obj.get(DISTANCE)).doubleValue() ;
                    break;
            }
        }
        double[] distances = new double[] { ki, sr, so };
        double[] positionShip = shipService.getLocation(shipService.getPositions(), distances);
        return new GetShipResponse(positionShip[0],positionShip[1]);

    }
}

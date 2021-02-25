package com.meli.challenge.satellite.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.meli.challenge.satellite.domain.Satellite;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static com.meli.challenge.constant.ConstantChallenge.*;

public class GetSatelliteSplitRequest {
    private double distances;
    private List<String>  message = new ArrayList<>();

    /**
     * <b>Nombre: </b> Constructor GetSharedRequest </br>
     * <b>Descripcion:</b> Captura el cuerpo de la peticion HTTP y arma la lista de satelites </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     */
    @JsonCreator
    public GetSatelliteSplitRequest(@JsonProperty("message") List<String> message, @JsonProperty("distance") double distances ) {
        this.distances = distances;
        this.message = message;
    }

    public double getDistances() {
        return distances;
    }

    public List<String> getMessage() {
        return message;
    }


}

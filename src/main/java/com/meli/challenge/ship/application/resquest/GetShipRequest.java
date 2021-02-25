package com.meli.challenge.ship.application.resquest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.LinkedHashMap;
import java.util.List;

public class GetShipRequest {
    @NotNull
    private List<LinkedHashMap> coordinates;

    /**
     * <b>Nombre: </b> Constructor GetShipRequest </br>
     * <b>Descripcion:</b> Captura el cuerpo de la peticion HTTP y arma el objeto Message </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     */
    @JsonCreator
    public GetShipRequest(@JsonProperty("coordinates") @NotNull final List<LinkedHashMap> coordinates ) {
        this.coordinates = coordinates;
    }

    /**
     * <b>Nombre: </b> getMessages </br>
     * <b>Descripcion:</b> Retorna encapsulado el Objeto Recuperado de la peticion HTTP. </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     * @return Message
     */
    public List<LinkedHashMap> getCoordinates(){return this.coordinates;}

}

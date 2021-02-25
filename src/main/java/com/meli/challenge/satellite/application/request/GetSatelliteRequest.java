package com.meli.challenge.satellite.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.meli.challenge.message.domain.Message;
import com.meli.challenge.satellite.domain.Satellite;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static com.meli.challenge.constant.ConstantChallenge.*;

public class GetSatelliteRequest {
    @NotNull
    private List<Satellite> satelliteList;
    private List<List<String>> listMessages = new ArrayList<>();
    private double [] distances;


    public GetSatelliteRequest(@NotNull List<Satellite> satelliteList, List<List<String>> listMessages, double[] distances) {
        this.satelliteList = satelliteList;
        this.listMessages = listMessages;
        this.distances = distances;
    }

    /**
     * <b>Nombre: </b> Constructor GetSharedRequest </br>
     * <b>Descripcion:</b> Captura el cuerpo de la peticion HTTP y arma la lista de satelites </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     */
    @JsonCreator
    public GetSatelliteRequest(@JsonProperty("satellites") @NotNull final List<Satellite> satellites ) {
        this.satelliteList = satellites;
        double ki = 0;
        double sr = 0;
        double so = 0;
        for (Satellite lst: this.satelliteList) {
                switch (lst.getName()){
                    case SATO:
                        so = lst.getDistance() ;
                        break;
                    case SKYWALKER:
                        sr = lst.getDistance() ;
                        break;
                    case KENOBI:
                        ki = lst.getDistance() ;
                        break;
                }
            listMessages.add(lst.getMessage());
        }
       this.distances = new double[] { ki, sr, so };
    }



    /**
     * <b>Nombre: </b> getSatelliteList </br>
     * <b>Descripcion:</b> Retorna encapsulado el Objeto Recuperado de la peticion HTTP. </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     * @return Message
     */
    public List<Satellite> getSatelliteList(){return this.satelliteList;}

    /**
     * <b>Nombre: </b> getListMessages </br>
     * <b>Descripcion:</b> Retorna encapsulado el Objeto Recuperado de la peticion HTTP. </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     * @return Message
     */
    public List<List<String>> getListMessages() {
        return listMessages;
    }

    /**
     * <b>Nombre: </b> getDistances </br>
     * <b>Descripcion:</b> Retorna encapsulado el Objeto Recuperado de la peticion HTTP. </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     * @return Message
     */
    public double[] getDistances() {
        return distances;
    }

}

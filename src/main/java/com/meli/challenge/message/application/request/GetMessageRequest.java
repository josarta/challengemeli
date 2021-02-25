package com.meli.challenge.message.application.request;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.meli.challenge.message.domain.Message;


import javax.validation.constraints.NotNull;
import java.util.List;


public class GetMessageRequest {
    @NotNull
    private Message messages;

    /**
     * <b>Nombre: </b> Constructor GetMessageRequest </br>
     * <b>Descripcion:</b> Captura el cuerpo de la peticion HTTP y arma el objeto Message </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     */
    @JsonCreator
    public GetMessageRequest(@JsonProperty("messages") @NotNull final List<List<String>> messages) {
        this.messages = new Message(messages);;
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
    public Message getMessages(){return this.messages;}
}

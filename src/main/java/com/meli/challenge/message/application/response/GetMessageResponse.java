package com.meli.challenge.message.application.response;


import org.springframework.http.HttpStatus;

public class GetMessageResponse {
    private final String messageReceived;
    private final String code;

    /**
     * <b>Nombre: </b> Constructor GetMessageResponse </br>
     * <b>Descripcion:</b> Inicaliza messageReceived y code. </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     * @param  messageReceived
     */
    public GetMessageResponse(String messageReceived) {
        this.messageReceived = messageReceived;
        this.code = HttpStatus.OK.toString();
    }

    /**
     * <b>Nombre: </b> getMessageReceived </br>
     * <b>Descripcion:</b> Encapsula el retorno de messageReceived. </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     * @return String
     */
    public String getMessageReceived() {
        return messageReceived;
    }
}

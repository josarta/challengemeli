package com.meli.challenge.message.domain.service;

import com.meli.challenge.message.domain.Message;
import com.meli.challenge.message.domain.exception.NoDataFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.meli.challenge.constant.ConstantDomain.*;


@Service
public class DomainMessageService  implements MessageService {
    @Value( "${challenge.satellites}" )
    private int numberSatellites;

    public DomainMessageService() {
    }


    /**
     * <b>Nombre: </b> getMsgPhrases </br>
     * <b>Descripcion:</b> Captura el array principal y lo filtra de forma que los datos por array sean unicos. </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     * @return List<String>
     */
    public List<String> getMsgPhrases(Message msgList){
        List<String> listWords = new ArrayList<>();
        for( List<String> msg : msgList.getMessage()){
            listWords = Stream.concat(listWords.stream(), msg.stream())
                    .distinct()
                    .collect(Collectors.toList());
        }
        listWords.remove(BLANK);
        return listWords;
    }

    /**
     * <b>Nombre: </b> getMessage </br>
     * <b>Descripcion:</b> Captura el mensaje desde el array principal y lo filtra adicionando espacios entre ellos en una sola cadena. </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     * @return String
     */
    public String completeMessage(Message msgList){
        String phrase;
        for(List<String> m : msgList.getMessage()){
            if(m.size()>0 && !m.get(0).equals(BLANK)){
                phrase = (m.size() == 1) ? m.get(0) : m.get(0) + SPACE;
                msgList.getMessage().forEach(s -> s.remove(0));
                return  phrase + completeMessage(msgList);
            }
        }
        return BLANK;
    }


    /**
     * <b>Nombre: </b> getMessage </br>
     * <b>Descripcion:</b> Básicamente solo valida que el conjunto de frases y el mensaje tengan el mismo tamaño </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     * @return boolean
     */
    public boolean validateMessagePhrases(List<String> phrases, String message){
        List<String> msg = Arrays.stream(message.split(SPACE)).collect(Collectors.toList());
        Collections.sort(phrases);
        Collections.sort(msg);
        return Arrays.equals(phrases.toArray(), msg.toArray());
    }


    /**
     * <b>Nombre: </b> getMessage </br>
     * <b>Descripcion:</b> Método agrupa las validaciones y métodos de ordenamiento para descifrar el mensaje de la nave </br>
     * <b>Fecha Creacion:</b> 23/02/2021 </br>
     * <b>Autor:</b> Jose Luis Sarta Alvarez </br>
     * <b>Fecha de ultima Modificacion:</b>  23/02/2021 </br>
     * <b>Modificado por:</b> Jose Luis Sarta Alvarez </br>
     * @return String
     */
    @Override
    public String getMessage(Message listMessages) throws NoDataFoundException {
       try {
           List<String> msgPhrases = getMsgPhrases(listMessages);
           String messageShip = completeMessage(listMessages);
           if(!validateMessagePhrases(msgPhrases,messageShip)) throw new ResponseStatusException( HttpStatus.NOT_FOUND,DATA_ERROR_WORDS);
           return messageShip;
       }catch(NullPointerException ex){
           throw new ResponseStatusException(
                   HttpStatus.NOT_FOUND, DATA_ERROR_WORDS, ex
           );
       }
    }
}

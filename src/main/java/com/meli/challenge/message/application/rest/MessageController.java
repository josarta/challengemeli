package com.meli.challenge.message.application.rest;

import com.meli.challenge.message.application.request.GetMessageRequest;
import com.meli.challenge.message.application.response.GetMessageResponse;
import com.meli.challenge.message.domain.exception.NoDataFoundException;
import com.meli.challenge.message.domain.service.MessageService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;



@RestController
@RequestMapping("/message")
@Api(value="MessageApi", description="Nivel 1 Exposición del método desde el dominio que responde  a  -> func GetMessage(messages ...[]string) (msg string)")
public class MessageController {
    private  final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    GetMessageResponse getMessageReceived(@RequestBody final GetMessageRequest getMessageRequest)  {
        try {
            String messageShip = messageService.getMessage(getMessageRequest.getMessages());
            return new GetMessageResponse(messageShip);
        } catch (NoDataFoundException e) {
           throw  new ResponseStatusException(HttpStatus.ACCEPTED.value(), e.getPerMessage(),e);
        }

    }

}

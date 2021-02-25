package com.meli.challenge.message.domain.service;

import com.meli.challenge.message.domain.Message;
import com.meli.challenge.message.domain.exception.NoDataFoundException;

public interface MessageService {

   public String getMessage( Message listMessages) throws NoDataFoundException;

}

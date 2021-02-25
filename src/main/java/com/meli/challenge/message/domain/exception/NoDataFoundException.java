package com.meli.challenge.message.domain.exception;

import static com.meli.challenge.constant.ConstantDomain.*;

public class NoDataFoundException extends  DataException {

    private static final long serialVersionUID = 2L;
    private  final String CODE = DATA_NO_FOUND_CODE;
    private  final String MESSAGE = DATA_NO_FOUND_MESSAGE;
    private  String prMessage;

    public NoDataFoundException() {
        super();
    }

    public NoDataFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public NoDataFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoDataFoundException(String message) {
        super(message);
        this.prMessage = message;
    }

    public NoDataFoundException(Throwable cause) {
        super(cause);
    }

    public String getCode() {
        return CODE;
    }

    public String getMessage() {
        return MESSAGE;
    }

    public String getPerMessage() {
        return prMessage;
    }
}

package com.arkas.springboard.service.exception;

/**
 * Created by Su Su.
 */
public class UserException extends Exception {

    public UserException(String message) {
        super(message);
    }

    public UserException(Throwable throwable) {
        super(throwable);
    }
}

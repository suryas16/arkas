package com.arkas.springboard.service.exception;

/**
 * Created by Su Su.
 */
public class AdminException extends Exception {

    public AdminException(String message) {
        super(message);
    }

    public AdminException(Throwable throwable) {
        super(throwable);
    }
}

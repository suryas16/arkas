package com.arkas.springboard.service.exception;

/**
 * Created by Su Su.
 */
public class PaymentException extends Exception {
    public PaymentException(String message) {
        super(message);
    }

    public PaymentException(Throwable throwable) {
        super(throwable);
    }
}

package com.nanfang.gradle_springboot.exception;

import lombok.Data;

@Data
public class PowerException extends RuntimeException {
    private Integer satus;

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public PowerException(String message, Integer satus) {
        super(message);
        this.satus = satus;
    }
}

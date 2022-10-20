package com.sparta.hm.exceptions;

public class SortLoaderException extends Exception{

    private final String message;

    public SortLoaderException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

package com.example.employee.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String errorMessage) {
        super(errorMessage);
    }
}

package com.in28miniutes.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;

public
class ErrorDetails {
    private LocalDate time;
    private String message;
    private String details;

    public
    ErrorDetails(LocalDate time, String message, String details) {
        this.time = time;
        this.message = message;
        this.details = details;
    }

    public
    LocalDate getTime() {
        return time;
    }

    public
    void setTime(LocalDate time) {
        this.time = time;
    }

    public
    String getMessage() {
        return message;
    }

    public
    void setMessage(String message) {
        this.message = message;
    }

    public
    String getDetails() {
        return details;
    }

    public
    void setDetails(String details) {
        this.details = details;
    }
}

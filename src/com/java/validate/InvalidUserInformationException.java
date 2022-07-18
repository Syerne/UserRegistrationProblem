package com.java.validate;

public class InvalidUserInformationException extends RuntimeException {

    enum ExceptionType {
        INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL_ID,
        INVALID_MOBILE_NUMBER, INVALID_PASSWORD, INVALID_GROUP_INFORMATION
    }

    public InvalidUserInformationException() {
        super();
    }
    ExceptionType type;

    public InvalidUserInformationException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}

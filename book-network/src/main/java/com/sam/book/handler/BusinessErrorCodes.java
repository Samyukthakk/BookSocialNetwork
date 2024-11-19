package com.sam.book.handler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public enum BusinessErrorCodes {
    NO_CODE(0, HttpStatus.NOT_IMPLEMENTED,"No Code"),
    INCORRECT_CURRENT_PASSWORD(300, HttpStatus.BAD_REQUEST,"Current password is incorrect"),
    NEW_PASSWORD_DOES_NOT_MATCH(301,HttpStatus.BAD_REQUEST," New Password does not"),
    ACCOUNT_LOCKED(302,HttpStatus.FORBIDDEN, "User account is locked"),
    ACCOUNT_DISABLED(303,HttpStatus.FORBIDDEN, "User account is disabled"),
    BAD_CREDENTIALS(304,HttpStatus.FORBIDDEN, "Login or Password is inCorrect")
    ;
    @Getter
    private final int code;
    @Getter
    private final String description;
    @Getter
    private final HttpStatus httpStatus;

    BusinessErrorCodes(int code, HttpStatus httpStatus, String description) {
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }
}

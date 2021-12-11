package com.example.netologyhibernate.excteption;

/**
 * @author Igor Khristiuk on 11.12.2021
 */
public class AppException extends RuntimeException{

    public AppException() {
        super();
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(Throwable cause) {
        super(cause);
    }
}

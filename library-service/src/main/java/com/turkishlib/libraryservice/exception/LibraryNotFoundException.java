package com.turkishlib.libraryservice.exception;

public class LibraryNotFoundException extends RuntimeException{

    public LibraryNotFoundException(String message) {
        super(message);
    }
}
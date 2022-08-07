package com.masai.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> myExceptionHandler(IllegalArgumentException ie){
        return new ResponseEntity<String>(ie.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> myExceptionAll(Exception e){
        return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<String>myNoExceptionFound(NoHandlerFoundException ne){
        return new ResponseEntity<String>(ne.getMessage(),HttpStatus.BAD_REQUEST);
    }
}

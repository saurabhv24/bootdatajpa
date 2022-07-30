package com.example.demo.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value= { MyException.class })
    protected ResponseEntity<Object> handleConflict(
            RuntimeException ex) {


        String bodyOfResponse = "This should be application specific";
        return ResponseEntity.ok(bodyOfResponse);
    }
}

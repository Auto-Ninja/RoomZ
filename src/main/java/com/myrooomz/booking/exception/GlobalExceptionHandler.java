package com.myrooomz.booking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    //Custom exception handler for ResourceNotFoundException
    @ExceptionHandler(value= RoomNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(RoomNotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse(HttpStatus.NOT_FOUND.value(),
                ex.getMessage()));
    }
}

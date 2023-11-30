package ru.otus.java.pro.spring.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDto> catchResourceNotFoundException(ResourceNotFoundException e) {
        return new ResponseEntity<>(
                new ErrorDto("RESOURCE_NOT_FOUND_ERROR", e.getMessage()),
                HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDto> catchRuntimeException(RuntimeException e) {
        return new ResponseEntity<>(
                new ErrorDto("RuntimeException", e.getMessage()),
                HttpStatus.NOT_FOUND
        );
    }
}

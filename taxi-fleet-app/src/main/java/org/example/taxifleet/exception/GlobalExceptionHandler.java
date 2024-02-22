package org.example.taxifleet.exception;

import org.example.taxifleet.exception.dto.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> handleAllUncaughtException(Exception exception, WebRequest request) {
        // log.error("Unknown error occurred", exception);
        ErrorResponseBuilder errorResponseBuilder = new ErrorResponseBuilder();
        // TODO change hardcoded value.
        errorResponseBuilder.debugModeEnabled(true);
        errorResponseBuilder.statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        errorResponseBuilder.statusName(HttpStatus.INTERNAL_SERVER_ERROR.name());
        errorResponseBuilder.exception(exception);
        ErrorResponseDTO errorResponseDTO = errorResponseBuilder.build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponseDTO);
    }
}

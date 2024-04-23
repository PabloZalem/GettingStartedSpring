package com.folhaDePagamento;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerAdivice {
    @ResponseBody
    @ExceptionHandler(NotFoundEmployeeException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFound(NotFoundEmployeeException ex) {
        return ex.getMessage();
    }
}

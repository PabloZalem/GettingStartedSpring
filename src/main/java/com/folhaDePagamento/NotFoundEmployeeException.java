package com.folhaDePagamento;

public class NotFoundEmployeeException extends RuntimeException {
    public NotFoundEmployeeException(Long id) {
        super("Employee not found: " + id);
    }
}

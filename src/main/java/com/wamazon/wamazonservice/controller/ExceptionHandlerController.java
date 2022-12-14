package com.wamazon.wamazonservice.controller;

import com.wamazon.wamazonservice.dto.ErrorNotification;
import com.wamazon.wamazonservice.exception.NotFoundException;
import com.wamazon.wamazonservice.exception.ValidationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(ValidationException.class)
    public ErrorNotification handleValidationException(ValidationException e) {
        ErrorNotification errorNotification = new ErrorNotification();
        errorNotification.setErrorMessage(e.getMessage());
        return errorNotification;
    }

    @ExceptionHandler(RuntimeException.class)
    public ErrorNotification handleRuntimeException(RuntimeException e) {
        ErrorNotification errorNotification = new ErrorNotification();
        errorNotification.setErrorMessage("Произошла техническая ошибка. Обратитесь в службу технической поддержки.");
        return errorNotification;
    }

    @ExceptionHandler(NotFoundException.class)
    public ErrorNotification handleNotFoundException(NotFoundException e) {
        ErrorNotification errorNotification = new ErrorNotification();
        errorNotification.setErrorMessage("Объект не найден.");
        return errorNotification;
    }
}

package com.undec.level.controller;

import com.undec.level.dto.Response;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.FileNotFoundException;

@ControllerAdvice(basePackages = "com.undec.level.controller")
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

  /* @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleFileNotFound (FileNotFoundException e){
        Response response = new Response();
        response.setStatus(203);
        response.setMessage(e.getStackTrace()[0].getClassName() + " - " + e.getStackTrace()[0].getMethodName() + " - " + e.getClass() + " - " + e.getMessage());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    */
   



    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleException (Exception e){
        Response response = new Response();
        response.setStatus(999);
        response.setMessage(e.getStackTrace()[0].getClassName() + " - " + e.getStackTrace()[0].getMethodName() + " - " + e.getClass() + " - " + e.getMessage());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}

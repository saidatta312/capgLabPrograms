package com.capg.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.product.exception.ProductNotFound;

@ControllerAdvice
@RestController

public class ProductErrorController {
	
	@ExceptionHandler(ProductNotFound.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "User Not Found" , code = HttpStatus.NOT_FOUND)
	public void handleUserNotFoundException() {		
}

}

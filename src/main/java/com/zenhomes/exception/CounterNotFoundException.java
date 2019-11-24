package com.zenhomes.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Counter Not Found")
public class CounterNotFoundException extends RuntimeException{}
package com.SchoolParent.Staff.Controller.Advice;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.SchoolParent.Staff.Response.ErrorResponse;



@RestControllerAdvice
public class GenaralExceptionalHandler {
	
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public ErrorResponse handleException(Exception exe) {
		ErrorResponse r = new ErrorResponse();
		r.setErrorcode("Genaral");
		r.setDescription(exe.getMessage());
		r.setException(exe);
		return r;
	}
	
	Logger logger=org.slf4j.LoggerFactory.getLogger(Exception.class);
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleExceptions(MethodArgumentNotValidException ex)
    {
        logger.info("MethodArgumentNotValidException method accessed");
        Map<String, String> map=new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(err->
        map.put(err.getField(),err.getDefaultMessage()));
        return map;
    }

}

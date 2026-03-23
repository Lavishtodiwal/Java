package com.example.FirstSpringBootProject.aspect;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.FirstSpringBootProject.POJO.StudentException;

@RestControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler
	public String logException(StudentException ex) {
		return ex.getMessag();
	}
	
	@ExceptionHandler
	public String logException(NullPointerException ex) {
		return ex.getMessage();
	}

	@ExceptionHandler
	public String logDepartmentException(MethodArgumentNotValidException ex) {
		return ex.getMessage();
	}

}

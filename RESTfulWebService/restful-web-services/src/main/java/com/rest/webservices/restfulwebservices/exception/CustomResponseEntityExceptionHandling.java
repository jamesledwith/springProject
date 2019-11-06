package com.rest.webservices.restfulwebservices.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rest.webservices.restfulwebservices.user.UserNotFoundException;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandling extends ResponseEntityExceptionHandler{
	
	//Generic exception throw
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request){
		ExceptionResponse exceptionResponse =
		new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false) );
		return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//User not found exception throw
	//retrieve one user - GET /users/{id} -> /users/1
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundExceptions(UserNotFoundException ex, WebRequest request){
		ExceptionResponse exceptionResponse =
		new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false) );
		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
	}
	
	//retrieve all users - GET /users
	/*@ExceptionHandler(UsersNotFoundException.class)
	public final ResponseEntity<Object> handleUsersNotFoundExceptions(UsersNotFoundException ex, WebRequest request){
		ExceptionResponse exceptionResponse =
		new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false) );
		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
	}*/
	
	//create a user - POST /users
	/*@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundExceptions(UserNotFoundException ex, WebRequest request){
		ExceptionResponse exceptionResponse =
		new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false) );
		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
	}*/
	
	//retrieve one user - GET /users/{id} -> /users/1
	/*@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundExceptions(UserNotFoundException ex, WebRequest request){
		ExceptionResponse exceptionResponse =
		new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false) );
		return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
	}*/
	
		
}

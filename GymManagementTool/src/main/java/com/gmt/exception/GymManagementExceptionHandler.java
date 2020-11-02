package com.gmt.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GymManagementExceptionHandler {

	@ExceptionHandler(GymManagementException.class)
	public ResponseEntity<Object> handleGymManagementException(GymManagementException exception) {
		return null;
	}

}

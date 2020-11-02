package com.gmt.exception;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GymManagementException extends RuntimeException {

	private String error;
	private String message;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timestamp;
	
	public GymManagementException(String error, String message, LocalDateTime timestamp) {
		super();
		this.error = error;
		this.message = message;
		this.timestamp = timestamp;
	}

	
	
}

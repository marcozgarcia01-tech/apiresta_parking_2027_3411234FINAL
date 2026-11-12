package com.sena.apiparking.exeption;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class ApiExeption extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private final HttpStatus status;

	public ApiExeption(HttpStatus status, String message) {
		super(message);
		this.status = status;
	}

	public static ApiExeption notFound(String msg) {
		return new ApiExeption(HttpStatus.NOT_FOUND, msg);
	}

	public static ApiExeption conflict(String msg) {
		return new ApiExeption(HttpStatus.CONFLICT, msg);
	}

	public static ApiExeption badrequest(String msg) {
		return new ApiExeption(HttpStatus.BAD_REQUEST, msg);
	}

}

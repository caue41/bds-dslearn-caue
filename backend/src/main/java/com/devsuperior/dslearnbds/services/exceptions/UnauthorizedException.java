package com.devsuperior.dslearnbds.services.exceptions;

public class UnauthorizedException extends RuntimeException{
	static final long serialVersionUID = 1L;
	
	public UnauthorizedException(String msg) {
		super(msg);
	}

}

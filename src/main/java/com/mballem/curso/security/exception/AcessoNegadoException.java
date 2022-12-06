package com.mballem.curso.security.exception;

@SuppressWarnings("serial")
public class AcessoNegadoException extends RuntimeException{

	//Generate Constructor from Superclass
	public AcessoNegadoException(String message) {
		super(message);
	}
}

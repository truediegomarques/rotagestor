package com.rota.services.exceptions;

public class ExisteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7746578840223644365L;
	
	public ExisteException(String mensagem) {
		super(mensagem);
	}
	
	public ExisteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}

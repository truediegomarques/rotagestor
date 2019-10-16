package com.rota.services.exceptions;

public class GrupoExisteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7746578840223644365L;
	
	public GrupoExisteException(String mensagem) {
		super(mensagem);
	}
	
	public GrupoExisteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}

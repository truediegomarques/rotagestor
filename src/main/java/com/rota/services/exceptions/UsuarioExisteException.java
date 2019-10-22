package com.rota.services.exceptions;

public class UsuarioExisteException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7820562734954661017L;

	public UsuarioExisteException(String mensagem) {
		super(mensagem);
	}
	
	public UsuarioExisteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}

package com.rota.services.exceptions;

public class NaoEncontradoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5080999729057094956L;

	public NaoEncontradoException(String mensagem) {
		super(mensagem);
	}

	public NaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

	
	
}

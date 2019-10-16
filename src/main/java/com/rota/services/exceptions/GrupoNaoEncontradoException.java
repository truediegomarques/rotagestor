package com.rota.services.exceptions;

public class GrupoNaoEncontradoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5080999729057094956L;

	public GrupoNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

	public GrupoNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

	
	
}

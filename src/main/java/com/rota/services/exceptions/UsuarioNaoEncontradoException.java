package com.rota.services.exceptions;

public class UsuarioNaoEncontradoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4126242527793423333L;

	public UsuarioNaoEncontradoException(String mensagem) {
		super(mensagem);
	}

	public UsuarioNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}

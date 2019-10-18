package com.rota.services.exceptions;

public class ProdutoExisteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7746578840223644365L;
	
	public ProdutoExisteException(String mensagem) {
		super(mensagem);
	}
	
	public ProdutoExisteException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}

package com.rota.enums;

public enum TipoTitulo {

	ESPECIE(1, "ESPECIE"), BOLETO(2, "BOLETO"), DEBITO(3, "DEBITO"), CREDITO(4, "CREDITO"), CHEQUE(5, "CHEQUE"),
	TRANSFERENCIA(6, "TRANSFERENCIA"), DEPOSITO(7, "DEPOSITO");

	private int cod;
	private String descricao;

	private TipoTitulo(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoTitulo toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoTitulo x : TipoTitulo.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
